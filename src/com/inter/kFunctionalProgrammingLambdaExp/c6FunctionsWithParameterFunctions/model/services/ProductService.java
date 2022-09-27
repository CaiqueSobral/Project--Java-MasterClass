package com.inter.kFunctionalProgrammingLambdaExp.c6FunctionsWithParameterFunctions.model.services;

import com.inter.kFunctionalProgrammingLambdaExp.c6FunctionsWithParameterFunctions.entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public Double filteredSum(List<Product> list, Predicate<Product> criteria) {
        double sum = 0.0;

        for (Product p : list) {
            if (criteria.test(p)) {
                sum += p.getPrice();
            }
        }

        return sum;
    }
}
