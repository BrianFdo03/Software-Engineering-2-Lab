
package com.mycompany.lab3;

public class BankAccount {
    
    private String accType;
    private int accNo;
    
    public void setaccNo(int accNo){
        this.accNo = accNo;
    }
    
    public int getaccNo(){
        return accNo;
    }
    
    public void setaccType(String accType){
        this.accType = accType;
    }
    
    public String getaccType(){
        return accType;
    }
}
