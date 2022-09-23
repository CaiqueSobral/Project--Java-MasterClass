package com.inter.jGenericsSetMap.c1IntroductionGenerics.application;

import com.inter.jGenericsSetMap.c1IntroductionGenerics.services.PrintServiceGeneric;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PrintServiceGeneric<Integer> ps = new PrintServiceGeneric<>();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        //ps.addValue("Caique"); // Error with type safety

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        System.out.println("First: " + ps.first());

        sc.close();
    }
}
