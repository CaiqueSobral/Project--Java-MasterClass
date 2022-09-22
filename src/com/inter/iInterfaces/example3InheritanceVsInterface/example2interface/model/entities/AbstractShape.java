package com.inter.iInterfaces.example3InheritanceVsInterface.example2interface.model.entities;

import com.inter.iInterfaces.example3InheritanceVsInterface.example2interface.model.enums.Color;

public abstract class AbstractShape implements Shape {

    private Color color;

    public AbstractShape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
