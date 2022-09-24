package com.inter.jGenericsSetMap.c4BoundedWildcards.example1.application;

import com.inter.jGenericsSetMap.c4BoundedWildcards.example1.entities.Circle;
import com.inter.jGenericsSetMap.c4BoundedWildcards.example1.entities.Rectangle;
import com.inter.jGenericsSetMap.c4BoundedWildcards.example1.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));
        //System.out.println("Total area circles: " + totalArea(myCircles)); // Error Shape is not a super type for circle
        System.out.println("Total area circles: " + totalAreaWildCard(myCircles));

        System.out.println("Total area: " + totalAreaWildCard(myShapes));
    }

    //public static double totalArea(List<Shape> list) {
    //    double sum = 0.0;
    //    for (Shape s : list) {
    //        sum += s.area();
    //    }
    //
    //    return sum;
    //}

    public static double totalAreaWildCard(List<? extends Shape> list) {
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }
}
