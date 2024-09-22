
package com.mycompany.lab4;

public class Rectangle extends Shape{
    public double length, width;
    
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    public double calculateArea(){
        return (length * width) ;
    }
}
