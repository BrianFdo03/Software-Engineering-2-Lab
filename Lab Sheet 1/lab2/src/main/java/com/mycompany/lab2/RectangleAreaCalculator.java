
package com.mycompany.lab2;

public class RectangleAreaCalculator {
    
    private int length,width;
    
    public RectangleAreaCalculator(int length, int width){
        this.length = length;
        this.width = width;
    }
    
    public int calculateArea(){
        return (length * width);
    }
}
