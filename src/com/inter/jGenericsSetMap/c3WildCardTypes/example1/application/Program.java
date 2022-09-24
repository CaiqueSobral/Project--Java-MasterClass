package com.inter.jGenericsSetMap.c3WildCardTypes.example1.application;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        //List<Object> myObjs = new ArrayList<>();
        //List<Integer> myNumbers = new ArrayList<>();
        //myObjs = myNumbers; // Error

        List<?> myObjs = new ArrayList<>();
        List<Integer> myNumbers = new ArrayList<>();
        myObjs = myNumbers;
    }
}
