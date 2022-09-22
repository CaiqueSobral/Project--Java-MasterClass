package com.inter.iInterfaces.example1.model.services;

import com.inter.iInterfaces.example1.model.entities.CarRental;
import com.inter.iInterfaces.example1.model.entities.Invoice;

public class RentalService {

    private Double pricePerDay;
    private Double pricePerHour;

    private BrazilTaxService taxService;

    public RentalService(Double pricePerDay, Double pricePerHour, BrazilTaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {
        long t1 = carRental.getStart().getTime();
        long t2 = carRental.getFinish().getTime();

        double hour = (double) (t2 - t1) / 1000 / 60 / 60;
        double basicPayment;

        if (hour <= 12.0) {
            basicPayment = Math.ceil(hour) * pricePerHour;
        } else {
            basicPayment = Math.ceil(hour / 24) * pricePerDay;
        }

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
