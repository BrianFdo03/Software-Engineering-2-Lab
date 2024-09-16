
package com.mycompany.lab5;

public class EmployeeInheritance {

    public static void main(String[] args) {
        
        Bonus bonus = new Bonus(1002, "Ben", "15/05/2001", 50000, 10000);
        
        bonus.displayEmployeeDetails();
        bonus.displayNewSalary();
    }
}
