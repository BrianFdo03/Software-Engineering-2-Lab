
package com.mycompany.lab5;

public class Employee {
    private int empID;
    public String empName, empDOB;
    private double empSalary;
    
    public Employee(int empId, String empName, String empDOB, double empSalary){
        this.empID = empId;
        this.empName = empName;
        this.empDOB = empDOB;
        this.empSalary = empSalary;
    }
    
    public void setEmpID(int empID){
        this.empID = empID; 
    }
    
    public int getEmpId(){
        return empID;
    }
    
    public void setempSalary(int empSalary){
        this.empSalary = empSalary; 
    }
    
    public double getEmpSalary(){
        return empSalary;
    }
    
    public void displayEmployeeDetails(){
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee DOB: " + empDOB);
        System.out.println("Employee Salary: " + empSalary);
        
    }
}
