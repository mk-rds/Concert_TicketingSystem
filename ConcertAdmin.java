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
public class ConcertAdmin extends Staff implements jobPosition{
    private double CommissionRate;
    private int code = 2021;

    

    public ConcertAdmin() {
    
    }

    public ConcertAdmin( String name, int yearJoined,double basicSalary, double CommissionRate,int balance, int accountNumber) {
        super(name, basicSalary, yearJoined, balance, accountNumber);
        this.CommissionRate = CommissionRate;
    }
 
 
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
   
  
   public double getCommissionRate() {
        return CommissionRate;
    }

    public void setCommissionRate(double CommissionRate) {
        this.CommissionRate = CommissionRate;
    }

    @Override
    public String toString() {
        return "ConcertAdmin{" + "CommissionRate=" + CommissionRate + ", code=" + code + '}';
    }

    

    @Override
    public double CalcSalary(){
        return this.getBasicSalary()*CommissionRate + this.getBasicSalary();
    }
    
     public static void ConcertDetails(Concert Concert , int subtotal,ticket ticket){
        System.out.println("\n]\t\t\t\t\t\t\t\tConcert Details\n\t\t\t\t\t\t  -----------------------------------------------------");
        System.out.println("\n\t\t\t\t\t\t\tConcert name\t: " + Concert.getConName());
        System.out.println("\t\t\t\t\t\t\tConcert time\t: " + Concert.getConTime());
        System.out.println("\n\t\t\t\t\t\t\tTicket Stock\t: " + "CAT1 has "+ ticket.getCAT1()+ "  stocks left"+
                                                "\n\t\t\t\t\t\t\t\t\t  CAT2 has " + ticket.getCAT2()+ "  stocks left"+
                                                "\n\t\t\t\t\t\t\t\t\t  CAT3 has " + ticket.getCAT3()+ "  stocks left"+
                                                "\n\t\t\t\t\t\t\t\t\t  CAT4 has " + ticket.getCAT4()+ "  stocks left"+
                                                "\n\t\t\t\t\t\t\t\t\t  CAT5 has " + ticket.getCAT5()+ "  stocks left");
        
        System.out.println("\n\t\t\t\t\t\t\tTotal revenue\t: RM " + subtotal);
        
    }
     
    

    @Override
    public String jobPosition() {
       return "\n\t\t\t\t\tConcert Admin\t: I manage the concert details";
    }

    
    
}
