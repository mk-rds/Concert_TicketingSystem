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
public class blackpink extends Concert {
    public static int bp_cat1 = 100;
    public static int bp_cat2 = 100;
    public static int bp_cat3 = 100;
    public static int bp_cat4 = 100;
    public static int bp_cat5 = 100;
    public static double totalBP = 0;
    
    
    
    
    public blackpink(){
        
    }
    
    public blackpink(String concert_name,String concert_time,String concert_date) {
        setConcert_name(concert_name);
        setConcert_time(concert_time);
        setConcert_date(concert_date);
    }
    
     public static void BPstock_cat1(int quantity){
        bp_cat1=bp_cat1-quantity;
    }
    
    public static void BPstock_cat2(int quantity){
        bp_cat2=bp_cat2-quantity;
    }
    
    public static void BPstock_cat3(int quantity){
        bp_cat3=bp_cat3-quantity;
    }
    
    public static void BPstock_cat4(int quantity){
        bp_cat4=bp_cat4-quantity;
    }
    
    public static void BPstock_cat5(int quantity){
        bp_cat5=bp_cat5-quantity;
    }
    
    public static void displayBP_stock(){
        System.out.print("[1] CAT1 : " + bp_cat1);
        System.out.print("\n[2] CAT2 : " + bp_cat2);
        System.out.print("\n[3] CAT3 : " + bp_cat3);
        System.out.print("\n[4] CAT4 : " + bp_cat4);
        System.out.print("\n[5] CAT5 : " + bp_cat5);
    }
    
    public void DisplayTicketBP(){
            Scanner input = new Scanner(System.in);
            System.out.println("\n1.CAT 1 [900] \n2.CAT 2 [800] \n3.CAT 3 [700] "
                                 + "\n4.CAT 4 [600] \n5.CAT 5 [500]\n");
            
            System.out.println("Please Select the type of ticket : ");
            int ticket = input.nextInt();
            
            BPSelectTicket(ticket);
        
          }
    
    
    @Override
    public String toString(){
        return super.toString() + "[1] CAT1 " + bp_cat1 + "\n[2] CAT2 " + bp_cat2 +  "\n[3] CAT3 " + bp_cat3 +  "\n[4] CAT4 " + bp_cat4  + "\n[5] CAT5 " + bp_cat5;
    }

    public void BPSelectTicket(int y){
             Scanner input = new Scanner(System.in);
         switch (y){
             
                case 1:
                  
                  System.out.println("enter your quantity :");
                  int quantity = input.nextInt();
                  if(quantity > bp_cat1){
                      super.toString();
                      displayBP_stock();
                      System.out.print("\nticket only left"+bp_cat1 + "\n");
                      DisplayTicketBP();
                    
                  }
                  else{
                  Calc_payment.TicketPrice_CAT1(quantity);
                  BPstock_cat1(quantity);
                  seat.DisplaySeatBP(y,quantity);
                  totalBP += Calc_payment.TicketPrice_CAT1(quantity);
                  }
                  break;
                    //TicketPrice_CAT1(quantity);
                    
                case 2:
                    System.out.println("enter your quantity :");
                    int quantity1 = input.nextInt();
                    if(quantity1 > bp_cat2){
                      super.toString();
                      displayBP_stock();
                      System.out.print("\nticket only left"+bp_cat2 + "\n");
                      DisplayTicketBP();
                     
                      
                      
                  }
                    else{
                    Calc_payment.TicketPrice_CAT2(quantity1);
                    BPstock_cat2(quantity1);
                    seat.DisplaySeatBP(y,quantity1);
                    totalBP += Calc_payment.TicketPrice_CAT2(quantity1);
                    }
                    
                    //TicketPrice_CAT2(quantity);
                    break;
                    
                case 3:
                    System.out.println("enter your quantity :");
                    int quantity2 = input.nextInt();
                    if(quantity2 > bp_cat3){
                      super.toString();
                      displayBP_stock();
                      System.out.print("\nticket only left"+bp_cat3 + "\n");
                      DisplayTicketBP();
                     
                      
                      
                  }
                    else{
                    Calc_payment.TicketPrice_CAT3(quantity2);
                    BPstock_cat4(quantity2);
                    seat.DisplaySeatBP(y,quantity2);
                    totalBP += Calc_payment.TicketPrice_CAT3(quantity2);
                    }
                    
                    //TicketPrice_CAT2(quantity);
                    break;
                    
                case 4:
                    System.out.println("enter your quantity :");
                    int quantity3 = input.nextInt();
                    if(quantity3 > bp_cat4){
                      super.toString();
                      displayBP_stock();
                      System.out.print("\nticket only left"+bp_cat4 + "\n");
                      DisplayTicketBP();
                     
                      
                      
                  }
                    else{
                    Calc_payment.TicketPrice_CAT4(quantity3);
                    BPstock_cat4(quantity3);
                    seat.DisplaySeatBP(y,quantity3);
                    totalBP += Calc_payment.TicketPrice_CAT4(quantity3);
                    }
                    
                    //TicketPrice_CAT2(quantity);
                    break;
                   
                case 5:
                    System.out.println("enter your quantity :");
                    int quantity4 = input.nextInt();
                    if(quantity4 > bp_cat5){
                      super.toString();
                      displayBP_stock();
                      System.out.print("\nticket only left"+bp_cat5 + "\n");
                      DisplayTicketBP();
                     
                      
                      
                  }
                    else{
                    Calc_payment.TicketPrice_CAT5(quantity4);
                    BPstock_cat5(quantity4);
                    seat.DisplaySeatBP(y,quantity4);
                    totalBP += Calc_payment.TicketPrice_CAT5(quantity4);
                    }
                    
                    //TicketPrice_CAT2(quantity);
                    break;
                    
                default :
                    System.out.println("Type again");
                    break;
            }
      
        }
    
    
    
}
