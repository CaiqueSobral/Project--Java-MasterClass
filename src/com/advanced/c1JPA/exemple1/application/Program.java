package com.advanced.c1JPA.exemple1.application;

import com.advanced.c1JPA.exemple1.dominio.Person;

public class Program {

    public static void main(String[] args) {

        Person p1 = new Person(1, "Kyky", "Kyky@gmail.com");
        Person p2 = new Person(2, "Suxu", "Suxu@gmail.com");
        Person p3 = new Person(3, "Samir", "Samir@gmail.com");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
