package com.inter.iInterfaces.example5DefaultMethods.services;

public class UsaInterestService implements InterestService {

    private Double interestRate;

    public UsaInterestService() {

    }

    public UsaInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
