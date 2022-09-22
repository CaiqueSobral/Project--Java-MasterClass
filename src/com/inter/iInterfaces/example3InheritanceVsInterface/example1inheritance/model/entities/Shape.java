package com.inter.iInterfaces.example3InheritanceVsInterface.example1inheritance.model.entities;

import com.inter.iInterfaces.example3InheritanceVsInterface.example1inheritance.model.enums.Color;

public abstract class Shape {
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();
}
