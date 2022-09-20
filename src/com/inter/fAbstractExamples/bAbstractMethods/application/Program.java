package com.inter.fAbstractExamples.bAbstractMethods.application;

import com.inter.fAbstractExamples.bAbstractMethods.entities.Circle;
import com.inter.fAbstractExamples.bAbstractMethods.entities.Rectangle;
import com.inter.fAbstractExamples.bAbstractMethods.entities.Shape;
import com.inter.fAbstractExamples.bAbstractMethods.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Color (Black/Blue/Red): ");
            Color color = Color.valueOf(sc.next().toUpperCase());

            if (ch == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS: ");

        for (Shape shape : list) {
            System.out.println(String.format("%.2f", shape.area()));
        }

        sc.close();
    }
}
