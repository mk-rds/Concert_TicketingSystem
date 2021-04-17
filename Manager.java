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
public class Manager extends Staff{
 private int code = 8888;
 private double bonus;
 
    public Manager() {
    }

    public Manager(String name, double basicSalary, int yearJoined, double bonus, int balance, int accountNumber) {
        super(name, basicSalary, yearJoined, balance, accountNumber);
        this.bonus = bonus;
    }

    

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Manager{" + "code=" + code + '}';
    }

 @Override
     public double CalcSalary(){
        return this.getBasicSalary() + bonus;
    }

    public void Calc_revenuePercentange(int subtotalBP,int subtotalJay){
         double revenue = subtotalBP + subtotalJay;
         double percentangeBP = (double)subtotalBP/(double)revenue * 100; 
         double percentangeJay = (double)subtotalJay/(double)revenue * 100;
         
         System.out.println("\t\t\t\t\tTotal revenue earned today\t: " + revenue);
         System.out.println("\t\t\t\t\tBlackpink revenue\t\t: " +percentangeBP + " %");
         System.out.println("\t\t\t\t\tJay Chou revenue\t\t: " +percentangeJay + " %");
         

}
   
    
    
    
    
}
