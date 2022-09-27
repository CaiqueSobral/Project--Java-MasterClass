package com.inter.kFunctionalProgrammingLambdaExp.c4Consumer.application;

import com.inter.kFunctionalProgrammingLambdaExp.c4Consumer.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //list.forEach(new PriceUpdate());
        //list.forEach(Product::staticPriceUpdate);
        //list.forEach(Product::nonStaticPriceUpdate);


        /*
        double factor = 1.1;
        Consumer<Product> cons = p -> {
            p.setPrice(p.getPrice() * factor);
        };
        list.forEach(cons);
        */

        double factor = 1.1;
        list.forEach(p -> p.setPrice(p.getPrice() * factor));

        list.forEach(System.out::println);
    }
}
