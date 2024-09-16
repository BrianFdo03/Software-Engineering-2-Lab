
package com.mycompany.lab3;

public class Test {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        
        bankAccount.setaccNo(100);
        bankAccount.setaccType("debit");
        
        System.out.println("Account No: " + bankAccount.getaccNo());
        System.out.println("Account Type: " + bankAccount.getaccType());
        
    }
}
