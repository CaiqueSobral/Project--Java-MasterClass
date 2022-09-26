package com.inter.jGenericsSetMap.hashCodeEquals.application;

import com.inter.jGenericsSetMap.hashCodeEquals.entities.Client;

public class Program {

    public static void main(String[] args) {

        String a = "Caique";
        String b = "Suxu";
        String c = "Suxu";

        System.out.println(a.equals(b)); // False

        System.out.println("------ Hash Code ------");
        System.out.println(a.hashCode());
        System.out.println(b.hashCode()); // HashCode
        System.out.println(c.hashCode()); // Same hashcode as b

        System.out.println("------ Hash Code and Equals ------");
        Client c1 = new Client("Caique", "Caique@gmail.com");
        Client c2 = new Client("Alex", "Alex@gmail.com");
        Client c3 = new Client("Caique", "Caique@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());

        System.out.println(c1.equals(c2)); // False
        System.out.println(c1.equals(c3)); // True -- Same hashCode
        System.out.println(c1 == c3); // False - Two different objects
    }
}
