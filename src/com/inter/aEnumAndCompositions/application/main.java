package com.inter.aEnumAndCompositions.application;

import com.inter.aEnumAndCompositions.entities.Order;
import com.inter.aEnumAndCompositions.entities.enums.OrderStatus;

import java.util.Date;

public class main {
    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1 + " " + os2);
    }
}
