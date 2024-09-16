
package com.mycompany.lab4;

public class Car {
    public String make,model;
    public int year;
    
    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    public void displayDetails(){
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }
}
