package com.inter.jGenericsSetMap.c8Maps.application;

import com.inter.jGenericsSetMap.c8Maps.entities.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program {

    public static void main(String[] args) {

        System.out.println("---------- TREE MAP - ORDER KEYS ----------");
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Caique");
        cookies.put("email", "Caique@gmail.com");
        cookies.put("phone", "99999");

        cookies.remove("email");
        cookies.put("phone", "88888"); // Exclude existing phone and include new one

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("(Doesn't exist) Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());

        System.out.println("ALL COOKIES");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }

        System.out.println();
        System.out.println("---------- HASH MAP - UNORDERED ITEMS ----------");
        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Tablet", 400.0);

        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        Product ps = new Product("Tv", 900.0);
        System.out.println("Contains 'ps' key: " + stock.containsKey(ps)); // False without Equals and HashCode - Uses pointers instead
    }
}
