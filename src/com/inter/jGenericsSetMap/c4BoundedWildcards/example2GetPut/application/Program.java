package com.inter.jGenericsSetMap.c4BoundedWildcards.example2GetPut.application;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(5);

        List<? extends Number> list = intList;
        Number x = list.get(0);

        //list.add(20); // Compiling error

        List<Object> myObjs = new ArrayList<Object>();
        myObjs.add("Maria");
        myObjs.add("Alex");

        List<? super Number> myNums = myObjs; // ? super Number = Number or Object
        myNums.add(10);
        myNums.add(3.14);

        //Number x = myNums.get(0); // Compiling error
    }
}
