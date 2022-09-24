package com.inter.jGenericsSetMap.c3WildCardTypes.example2.application;

import java.util.Arrays;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
        printList(myStrs);
    }


    // With the wildcard type, I can print any type of list (Integer, String, Double)
    public static void printList(List<?> list) {
        //list.add(3); // Error, can't add data into wildcard list
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
