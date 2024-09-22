
package com.mycompany.lab3;

public class Lab3 {

    public static void main(String[] args) {
        Car car = new Car("Toyota", 30, "Car");
        Bike bike = new Bike("Honda", 25, "Bike");
        
        car.showDetails();
        bike.showDetails();
    }
}
