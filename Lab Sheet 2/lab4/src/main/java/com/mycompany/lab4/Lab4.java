
package com.mycompany.lab4;
import java.lang.Math;

public class Lab4 {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(15, 20);
        Circle circle = new Circle(14);
        
        System.out.println("Area of Rectangle: " + rectangle.calculateArea() );
        System.out.println("Area of Circle: " + circle.calculateArea() );
    }
}
