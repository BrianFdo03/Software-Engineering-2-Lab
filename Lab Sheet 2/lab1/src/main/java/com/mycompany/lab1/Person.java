
package com.mycompany.lab1;

public class Person {
    
    public String name;
    public int age;
    
    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
