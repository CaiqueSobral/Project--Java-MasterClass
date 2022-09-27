package com.inter.kFunctionalProgrammingLambdaExp.c5Function.util;

import com.inter.kFunctionalProgrammingLambdaExp.c5Function.entities.Product;

import java.util.function.Function;

public class UpperCaseName implements Function<Product, String> {

    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
}
