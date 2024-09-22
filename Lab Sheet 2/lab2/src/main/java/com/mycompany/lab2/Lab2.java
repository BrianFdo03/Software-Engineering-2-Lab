
package com.mycompany.lab2;

public class Lab2 {

    public static void main(String[] args) {
        
        Student student = new Student("Ben", 20);
        
        student.setName("Chad");
        student.setAge(21);
        
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}
