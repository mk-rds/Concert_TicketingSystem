/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import static assignment.Calc_payment.TicketPrice_CAT1;
import static assignment.Calc_payment.TicketPrice_CAT2;
import static assignment.Calc_payment.TicketSold;
import static assignment.Calc_payment.revenue;
import static assignment.StockRemaining.BPstock_cat1;
import static assignment.StockRemaining.BPstock_cat2;
import static assignment.customer.login_verification;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class MainMenu {

  
   
     private customer customer;
    
    public MainMenu(){
        
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        customer cus = new customer();
        
       System.out.print("LOGIN [1]");
       int option;
       option = input.nextInt();
       if(option == 1){
           login_verification();
       }
       
       double quantity;
      
       
       do{
           System.out.println("[1] INTERFACE");
           System.out.println("[5] QUIT");
           option = input.nextInt();
           
           if(option == 1){
               System.out.print("enter what concert :");
                option = input.nextInt();
            switch(option){
                case 1: System.out.print("choose your seat ");
                   int seat;
                   seat = input.nextInt();
                   switch(seat){
                       case 1:System.out.print("enter quantity in CAT1 :");
                              quantity = input.nextDouble();
                              TicketPrice_CAT1(quantity);
                              BPstock_cat1(quantity);
                              break;
                              
                       case 2:System.out.print("enter quantity in CAT2 :");
                              quantity = input.nextDouble();
                              TicketPrice_CAT2(quantity);
                              BPstock_cat2(quantity);
                              break;
                   }
                   
                   
           case 2:System.out.print("choose your seat");
       }
           }
           
           
           
       }while(option != 5);
       
       
       
      
       
       
       
     
       System.out.print("ticket sold number:" + TicketSold);
       System.out.print("ticket sold revenue: " + revenue);
       
       
       
       
       
    }
}
