
package com.mycompany.lab3;

public class Vehicle {
    public String brand;
    public int speed;
    
    public Vehicle(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }
    
    public void showDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}
