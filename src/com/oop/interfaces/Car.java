package com.oop.interfaces;

public class Car {
  private int doors;
  private String model;


  

  public Car(int doors, String model) {
    this.doors = doors;
    this.model = model;
  }

  public int getDoors() {
    return this.doors;
  }

  public void setDoors(int doors) {
    this.doors = doors;
  }

  public String getModel() {
    return this.model;
  }

  public void setModel(String model) {
    this.model = model;
  }

}
