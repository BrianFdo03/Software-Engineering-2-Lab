
package com.mycompany.lab3;

public class Bike extends Vehicle {
    public String type;
    
    public Bike(String brand, int speed, String type){
        super(brand, speed);
        this.type = type;
    }
    
    public void showDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Type: " + type);
    }
}
