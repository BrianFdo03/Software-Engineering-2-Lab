
package com.mycompany.lab4;

import java.lang.Math;

public class Circle extends Shape{
    public double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public double calculateArea(){
        return (Math.PI * Math.pow(radius, 2));
    }
}
