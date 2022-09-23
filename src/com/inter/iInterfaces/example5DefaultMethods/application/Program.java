package com.inter.iInterfaces.example5DefaultMethods.application;

import com.inter.iInterfaces.example5DefaultMethods.services.BrazilInterestService;
import com.inter.iInterfaces.example5DefaultMethods.services.InterestService;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        InterestService is = new BrazilInterestService(2.0);
        double payment = is.payment(amount, months);

        System.out.println("Payment after " + months + " months");
        System.out.println(String.format("%.2f", payment));

        sc.close();
    }
}
