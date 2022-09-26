package com.inter.kFunctionalProgrammingLambdaExp.c3Predicate.util;

import com.inter.kFunctionalProgrammingLambdaExp.c3Predicate.entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 100.0;
    }
}
