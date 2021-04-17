/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaldemo;

/**
 *
 * @author User
 */
public class Staff {
    private String name;
    private double basicSalary;
    private int yearJoined;
    private int balance;
    private int accountNumber;

    

    
    
    public Staff(){
    
    }

    public Staff(String name, double basicSalary, int yearJoined, int balance, int accountNumber) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.yearJoined = yearJoined;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    
    

    public int getYearJoined() {
        return yearJoined;
    }

    public void setYearJoined(int yearJoined) {
        this.yearJoined = yearJoined;
    }

  
    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    
      
    public void depositSalary(double salary){
        basicSalary += salary;
    }

    @Override
    public String toString() {
        return "Staff{" + "name=" + name + ", basicSalary=" + basicSalary + ", yearJoined=" + yearJoined + "}";
    }
    
    public double CalcSalary(){
        return basicSalary;
    }
    
   
    
}
