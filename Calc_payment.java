/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author User
 */
public class Calc_payment {
    
    public static final double GST = 0.06;
    public static int TicketSold=0;
    public static double revenue;
    public static double TotalPayment=0;
   
    public static double TicketPrice_CAT1(int quantity){
       double total = 900 * quantity + (GST * 900 * quantity);
       
       System.out.println("total :" + total);
       TicketSold += quantity;
       revenue += total;
       TotalPayment = total;
       
       
       return total;
    }
    
    public static double TicketPrice_CAT2(int quantity){
       double total = 800 * quantity + (GST * 800 * quantity);
       System.out.print("total :" + total);
        TicketSold += quantity;
        revenue += total;
        TotalPayment = total;
        
        return total;
    }
    
    public static double TicketPrice_CAT3(int quantity){
       double total = 700 * quantity + (GST * 700 * quantity);
       System.out.print("total :" + total);
       TicketSold += quantity;
       revenue += total;
       TotalPayment = total;
       
       return total;
    }
    
    public static double TicketPrice_CAT4(int quantity){
       double total = 600 * quantity + (GST * 600 * quantity);
       System.out.print("total :" + total);
       TicketSold += quantity;
       revenue += total;
       TotalPayment = total;
       
       return total;
    }
    
    public static double TicketPrice_CAT5(int quantity){
       double total = 500 * quantity + (GST * 500 * quantity);
       System.out.print("total :" + total);
       TicketSold += quantity;
       revenue += total;
       TotalPayment = total;
        
       return total;
    }
    
   
    
    
    
    
}
