package com.inter.kFunctionalProgrammingLambdaExp.c1Comparator.application;

import com.inter.kFunctionalProgrammingLambdaExp.c1Comparator.entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 400.0));

        // Collections.sort(list); // Error, cant be sorted without class implementing comparable
        // list.sort(new MyComparator());

        // Comparator<Product> comp = new Comparator<Product>() {
//            Override
//            public int compare(Product p1, Product p2) {
//                return p1.getName().toLowerCase().compareTo(p2.getName().toLowerCase());
//            }
//        };
        // SAME THING BELOW

        Comparator<Product> comp = (p1, p2) -> p1.getName().toLowerCase().compareTo(p2.getName().toLowerCase());
        list.sort(comp);


        list.sort((p1, p2) -> p1.getName().toLowerCase().compareTo(p2.getName().toLowerCase()));

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
