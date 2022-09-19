package com.inter.dExercise1.application;

import com.inter.dExercise1.entities.Client;
import com.inter.dExercise1.entities.Order;
import com.inter.dExercise1.entities.OrderItem;
import com.inter.dExercise1.entities.Product;
import com.inter.dExercise1.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth Date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.nextLine());

        Client c1 = new Client(name, email, birthDate);

        System.out.println("Enter order data");
        System.out.print("Status: ");
        String status = sc.nextLine();

        Order o1 = new Order(OrderStatus.valueOf(status), c1);

        System.out.print("How many items to this order? ");
        int nItems = sc.nextInt();

        for (int i = 1; i <= nItems; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            String pdName = sc.next();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int qty = sc.nextInt();

            o1.addItem(new OrderItem(qty, new Product(pdName, price)));
        }

        System.out.println(o1.toString());
    }
}
