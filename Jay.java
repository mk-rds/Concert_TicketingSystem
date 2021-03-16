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
public class Jay extends Concert{
    public static int jay_cat1 = 100;
    public static int jay_cat2 = 100;
    public static int jay_cat3 = 100;
    public static int jay_cat4 = 100;
    public static int jay_cat5 = 100;
    public static double totalJay = 0;
    
    
    
    
    public Jay(){
        
    }
    
    public Jay(String concert_name,String concert_time,String concert_date) {
        setConcert_name(concert_name);
        setConcert_time(concert_time);
        setConcert_date(concert_date);
    }
    
     public static void Jaystock_cat1(int quantity){
        jay_cat1=jay_cat1-quantity;
    }
    
    public static void Jaystock_cat2(int quantity){
        jay_cat2=jay_cat2-quantity;
    }
    
    public static void Jaystock_cat3(int quantity){
        jay_cat3=jay_cat3-quantity;
    }
    
    public static void Jaystock_cat4(int quantity){
        jay_cat4=jay_cat4-quantity;
    }
    
    public static void Jaystock_cat5(int quantity){
        jay_cat5=jay_cat5-quantity;
    }
    
    public static void displayJay_stock(){
        System.out.print("[1] CAT1 [900]: " + jay_cat1);
        System.out.print("\n[2] CAT2 [800]: " + jay_cat2);
        System.out.print("\n[3] CAT3 [700]: " + jay_cat3);
        System.out.print("\n[4] CAT4 [600]: " + jay_cat4);
        System.out.print("\n[5] CAT5 [500]: " + jay_cat5);
    }
    
    public void DisplayTicketJay(){
            Scanner input = new Scanner(System.in);
            System.out.println("\nPlease Select the type of ticket : ");
            int ticket = input.nextInt();
            
            JaySelectTicket(ticket);
        
          }
    
    
    @Override
    public String toString(){
        return super.toString() + "[1] CAT1 [900] , " + "Tickets remaining : " + jay_cat1 + 
                                  "\n[2] CAT2 [800] , " + "Tickets remaining : " + jay_cat2 +  
                                  "\n[3] CAT3 [700] , " + "Tickets remaining : " + jay_cat3 +  
                                  "\n[4] CAT4 [600] , " + "Tickets remaining : " + jay_cat4 + 
                                  "\n[5] CAT5 [500] , " + "Tickets remaining : " + jay_cat5;
    }

    public void JaySelectTicket(int y){
             Scanner input = new Scanner(System.in);
         switch (y){
             
                case 1:
                  
                  System.out.println("enter your quantity :");
                  int quantity = input.nextInt();
                  if(quantity > jay_cat1){
                      super.toString();
                      displayJay_stock();
                      System.out.print("\nticket only left"+jay_cat1 + "\n");
                      DisplayTicketJay();
                    
                  }
                  else{
                  totalJay += Calc_payment.TicketPrice_CAT1(quantity);
                  Jaystock_cat1(quantity);
                  seat.DisplaySeatJayChou(y,quantity);
                  }
                  break;
                    //TicketPrice_CAT1(quantity);
                    
                case 2:
                    System.out.println("enter your quantity :");
                    int quantity1 = input.nextInt();
                    if(quantity1 > jay_cat2){
                      super.toString();
                      displayJay_stock();
                      System.out.print("\nticket only left"+jay_cat2 + "\n");
                      DisplayTicketJay();
                     
                      
                      
                  }
                    else{
                    totalJay += Calc_payment.TicketPrice_CAT2(quantity1);
                    Jaystock_cat2(quantity1);
                    seat.DisplaySeatJayChou(y,quantity1);
                    }
                    
                    //TicketPrice_CAT2(quantity);
                    break;
                    
                case 3:
                    System.out.println("enter your quantity :");
                    int quantity2 = input.nextInt();
                    if(quantity2 > jay_cat3){
                      super.toString();
                      displayJay_stock();
                      System.out.print("\nticket only left"+jay_cat3 + "\n");
                      DisplayTicketJay();
                     
                      
                      
                  }
                    else{
                    totalJay += Calc_payment.TicketPrice_CAT3(quantity2);
                    Jaystock_cat4(quantity2);
                    seat.DisplaySeatJayChou(y,quantity2);
                    }
                    
                    //TicketPrice_CAT2(quantity);
                    break;
                    
                case 4:
                    System.out.println("enter your quantity :");
                    int quantity3 = input.nextInt();
                    if(quantity3 > jay_cat4){
                      super.toString();
                      displayJay_stock();
                      System.out.print("\nticket only left"+jay_cat4 + "\n");
                      DisplayTicketJay();
                     
                      
                      
                  }
                    else{
                    totalJay += Calc_payment.TicketPrice_CAT4(quantity3);
                    Jaystock_cat4(quantity3);
                    seat.DisplaySeatJayChou(y,quantity3);
                    }
                    
                    //TicketPrice_CAT2(quantity);
                    break;
                   
                case 5:
                    System.out.println("enter your quantity :");
                    int quantity4 = input.nextInt();
                    if(quantity4 > jay_cat5){
                      super.toString();
                      displayJay_stock();
                      System.out.print("\nticket only left"+jay_cat5 + "\n");
                      DisplayTicketJay();
                     
                      
                      
                  }
                    else{
                    totalJay += Calc_payment.TicketPrice_CAT5(quantity4);
                    Jaystock_cat5(quantity4);
                    seat.DisplaySeatJayChou(y,quantity4);
                    }
                    
                    //TicketPrice_CAT2(quantity);
                    break;
                    
                default :
                    System.out.println("Type again");
                    break;
            }
      
        }
    
    
    
}
