package com.inter.kFunctionalProgrammingLambdaExp.c4Consumer.util;


import com.inter.kFunctionalProgrammingLambdaExp.c4Consumer.entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {

    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}
