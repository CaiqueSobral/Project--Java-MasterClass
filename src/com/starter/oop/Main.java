package com.starter.oop;

import com.starter.oop.interfaces.Car;

public class Main {
  public static void main(String[] args) {
    Car firstCar = new Car(2, "ford");

    System.out.println(firstCar.getDoors() + firstCar.getModel());
  }
}
