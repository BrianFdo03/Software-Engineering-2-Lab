
package com.mycompany.lab5;

public class Bonus extends Employee {
    
    private double bonus;
    double newSalary;
    
    public Bonus(int empID, String empName, String empDOB, double empSalary ,double bonus){
        super(empID,empName, empDOB, empSalary);
        this.bonus = bonus;
    }
    
    public void displayNewSalary(){
        newSalary = super.getEmpSalary() + bonus;
        System.out.println("Employee Salary with Bonus: " + newSalary);
    }
}
