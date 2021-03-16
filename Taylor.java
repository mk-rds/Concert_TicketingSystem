/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Taylor extends Concert {
    public static int taylor_cat1 = 100;
    public static int taylor_cat2 = 100;
    public static int taylor_cat3 = 100;
    public static int taylor_cat4 = 100;
    public static int taylor_cat5 = 100;
    public static double totalTaylor = 0;
    
    
    
    
    public Taylor(){
        
    }
    
    public Taylor(String concert_name,String concert_time,String concert_date) {
        setConcert_name(concert_name);
        setConcert_time(concert_time);
        setConcert_date(concert_date);
    }
    
     public static void Taylorstock_cat1(int quantity){
        taylor_cat1=taylor_cat1-quantity;
    }
    
    public static void Taylorstock_cat2(int quantity){
        taylor_cat2=taylor_cat2-quantity;
    }
    
    public static void Taylorstock_cat3(int quantity){
        taylor_cat3=taylor_cat3-quantity;
    }
    
    public static void Taylorstock_cat4(int quantity){
        taylor_cat4=taylor_cat4-quantity;
    }
    
    public static void Taylorstock_cat5(int quantity){
        taylor_cat5=taylor_cat5-quantity;
    }
    
    public static void displayTaylor_stock(){
        System.out.print("[1] CAT1 [900]: " + taylor_cat1);
        System.out.print("\n[2] CAT2 [800]: " + taylor_cat2);
        System.out.print("\n[3] CAT3 [700]: " + taylor_cat3);
        System.out.print("\n[4] CAT4 [600]: " + taylor_cat4);
        System.out.print("\n[5] CAT5 [500]: " + taylor_cat5);
    }
    
    public void DisplayTicketTaylor(){
            Scanner input = new Scanner(System.in);
            System.out.println("\nPlease Select the type of ticket : ");
            int ticket = input.nextInt();
            
            TaylorSelectTicket(ticket);
        
          }
    
    
    @Override
    public String toString(){
        return super.toString() + "[1] CAT1 [900] , " + "Tickets remaining : " + taylor_cat1 + 
                                  "\n[2] CAT2 [800] , " + "Tickets remaining : " + taylor_cat2 +  
                                  "\n[3] CAT3 [700] , " + "Tickets remaining : " + taylor_cat3 +  
                                  "\n[4] CAT4 [600] , " + "Tickets remaining : " + taylor_cat4 + 
                                  "\n[5] CAT5 [500] , " + "Tickets remaining : " + taylor_cat5;
    }

    public void TaylorSelectTicket(int y){
             Scanner input = new Scanner(System.in);
         switch (y){
             
                case 1:
                  
                  System.out.println("enter your quantity :");
                  int quantity = input.nextInt();
                  if(quantity > taylor_cat1){
                      super.toString();
                      displayTaylor_stock();
                      System.out.print("\nticket only left"+taylor_cat1 + "\n");
                      DisplayTicketTaylor();
                    
                  }
                  else{
                  totalTaylor += Calc_payment.TicketPrice_CAT1(quantity);
                  Taylorstock_cat1(quantity);
                  seat.DisplaySeatTaylor(y,quantity);
                  }
                  break;
                    //TicketPrice_CAT1(quantity);
                    
                case 2:
                    System.out.println("enter your quantity :");
                    int quantity1 = input.nextInt();
                    if(quantity1 > taylor_cat2){
                      super.toString();
                      displayTaylor_stock();
                      System.out.print("\nticket only left"+taylor_cat2 + "\n");
                      DisplayTicketTaylor();
                     
                      
                      
                  }
                    else{
                    totalTaylor += Calc_payment.TicketPrice_CAT2(quantity1);
                    Taylorstock_cat2(quantity1);
                    seat.DisplaySeatTaylor(y,quantity1);
                    }
                    
                    //TicketPrice_CAT2(quantity);
                    break;
                    
                case 3:
                    System.out.println("enter your quantity :");
                    int quantity2 = input.nextInt();
                    if(quantity2 > taylor_cat3){
                      super.toString();
                      displayTaylor_stock();
                      System.out.print("\nticket only left"+taylor_cat3 + "\n");
                      DisplayTicketTaylor();
                     
                      
                      
                  }
                    else{
                    totalTaylor += Calc_payment.TicketPrice_CAT3(quantity2);
                    Taylorstock_cat4(quantity2);
                    seat.DisplaySeatTaylor(y,quantity2);
                    }
                    
                    //TicketPrice_CAT2(quantity);
                    break;
                    
                case 4:
                    System.out.println("enter your quantity :");
                    int quantity3 = input.nextInt();
                    if(quantity3 > taylor_cat4){
                      super.toString();
                      displayTaylor_stock();
                      System.out.print("\nticket only left"+taylor_cat4 + "\n");
                      DisplayTicketTaylor();
                     
                      
                      
                  }
                    else{
                    totalTaylor += Calc_payment.TicketPrice_CAT4(quantity3);
                    Taylorstock_cat4(quantity3);
                    seat.DisplaySeatTaylor(y,quantity3);
                    }
                    
                    //TicketPrice_CAT2(quantity);
                    break;
                   
                case 5:
                    System.out.println("enter your quantity :");
                    int quantity4 = input.nextInt();
                    if(quantity4 > taylor_cat5){
                      super.toString();
                      displayTaylor_stock();
                      System.out.print("\nticket only left"+taylor_cat5 + "\n");
                      DisplayTicketTaylor();
                     
                      
                      
                  }
                    else{
                    totalTaylor += Calc_payment.TicketPrice_CAT5(quantity4);
                    Taylorstock_cat5(quantity4);
                    seat.DisplaySeatTaylor(y,quantity4);
                    }
                    
                    //TicketPrice_CAT2(quantity);
                    break;
                    
                default :
                    System.out.println("Type again");
                    break;
            }
      
        }
    
    
    
}