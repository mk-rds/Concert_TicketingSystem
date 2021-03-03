/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import static assignment.Calc_payment.TicketPrice_CAT1;
import static assignment.Calc_payment.TicketPrice_CAT2;
import static assignment.Calc_payment.TicketPrice_CAT3;
import static assignment.Calc_payment.TicketPrice_CAT4;
import static assignment.Calc_payment.TicketPrice_CAT5;
import static assignment.StockRemaining.BPstock_cat1;
import java.util.Scanner;

/**
 *
 * @author mingkit
 */
public class Interface {


    
    private String concert_name;
    private String concert_time;
    private static int ticket_stock;
    
    private double quantity; //the quantity of ticket user choose
    private int index;
    public Interface() {
    }

    public Interface(String concert_name, String concert_time, int ticket_stock, int ticket,double quantity) {
        this.concert_name = concert_name;
        this.concert_time = concert_time;
        Interface.ticket_stock = ticket_stock;
     
        this.quantity = quantity;
  
    }

    public Interface(int index,String concert_name, String concert_time) {
        this.index = index;
        this.concert_name = concert_name;
        this.concert_time = concert_time;
        
    }

    public String getConcert_name() {
        return concert_name;
    }

    public String getConcert_time() {
        return concert_time;
    }

    

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    

    @Override
    public String toString() {
        return "\n"+index + ".Concert Details : "+concert_name +", "+ concert_time +"\n Ticket Available : ";
    }
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // select prompt user to select concert
             Scanner scan =new Scanner(System.in);
       //display method,selection
       
        System.out.println("\tConcert Available");
        // ticket array
         Interface[] Interface1 ={new Interface(1,"Blackpink","2 March 2021 , 7pm"),
                                  new Interface(2,"Jay Chou","24 August 2021 , 7pm "),
                                  new Interface(3,"Taylor Swift","13 December 2021 , 7pm")};
         //display array
         int count = 1 ;
        for (int i = 0 ; i < count ; i ++) {
            for (Interface Interface11 : Interface1) {
                System.out.println(Interface11);
            }
          
       
           
            // prompt user to select ticket type
       // while(ticket > 5 && 1 >= ticket){    
       
            System.out.println("1.CAT 1 [900] \n2.CAT 2 [800] \n3.CAT 3 [700] "
                                 + "\n4.CAT 4 [600] \n5.CAT 5 [500]\n");
            
            System.out.println("Please Select the type of ticket : ");
            int ticket = scan.nextInt();
            SelectTicket(ticket);
             
            //prompt user to select ticket quantity
            System.out.println("Please enter the quantity of ticket : ");
            int ticket1 = scan.nextInt();
            
         //prompt user whether wanna add tickets
            System.out.println("Do you want to add on ticket ? \n 1.YES \n 2. Continue to Payment");
            int addon = scan.nextInt();
                addon(addon);   
        }
        }
        
    
    
    
    
    
    
    
    
    
    
    
    
        public static void selectConcert(int x) {
             Interface[] Interface1 ={new Interface(1,"Blackpink","2 March 2021 , 7pm"),
                                  new Interface(2,"Jay Chou","24 August 2021 , 7pm "),
                                  new Interface(3,"Taylor Swift","13 December 2021 , 7pm")};
         //display array
        switch (x) {
                case 1:
                    System.out.println("You have selected ");
                    System.out.println(Interface1[x-1]);
                    break;
                    
                case 2:
                    System.out.println("You have selected ");
                    System.out.println(Interface1[x-1]);
                    break;
                            
                case 3:
                    System.out.println("You have selected ");
                    System.out.println(Interface1[x-1]);
                    break;
                    
                default:
                   break;
            } 
       
    }
        
        public static void SelectTicket(int y){
           Scanner scan  = new Scanner(System.in);
           
         switch (y){
             
                case 1:
                  System.out.println("enter your quantity :");
                  double quantity = scan.nextDouble();
                  TicketPrice_CAT1(quantity);
                  BPstock_cat1(quantity);
                  break;
                    //TicketPrice_CAT1(quantity);
                    
                case 2:
                    System.out.println("enter your quantity :");
                    double quantity1 = scan.nextDouble();
                    TicketPrice_CAT2(quantity1);
                    //TicketPrice_CAT2(quantity);
                    break;
                    
                case 3:
                    System.out.println("enter your quantity :");
                    double quantity2 = scan.nextDouble();
                    TicketPrice_CAT3(quantity2);
                    
                    break;
                    
                case 4:
                    System.out.println("enter your quantity :");
                    double quantity3 = scan.nextDouble();
                    TicketPrice_CAT4(quantity3);
                   break;
                   
                case 5:
                    System.out.println("enter your quantity :");
                    double quantity4 = scan.nextDouble();
                    TicketPrice_CAT5(quantity4);
                    break;
                    
                default :
                    System.out.println("Type again");
                    break;
            }
      
        }
        
        public static void addon(int a){
            Scanner scan = new Scanner(System.in);
         for (int i = 0 ;i<2  ;i++)
        switch (a) {
            
            case 1:
                  System.out.println("1.CAT 1 [900] \n2.CAT 2 [800] \n3.CAT 3 [700] "
                                 + "\n4.CAT 4 [600] \n5.CAT 5 [500]\n");
            
            System.out.println("Please Select the type of ticket : ");
            int ticket = scan.nextInt();
            SelectTicket(ticket);
             
            //prompt user to select ticket quantity
            System.out.println("Please enter the quantity of ticket : ");
            int ticket1 = scan.nextInt();
            
                break;
                
            case 2:
                
                //proceed to payment
                break;
            default:
                break;
        }
        }
       
        public static void displayConcert(){
            System.out.println("\tConcert Available");
        // ticket arrayS
         Interface[] Interface1 ={new Interface(1,"Blackpink","2 March 2021 , 7pm"),
                                  new Interface(2,"Jay Chou","24 August 2021 , 7pm "),
                                  new Interface(3,"Taylor Swift","13 December 2021 , 7pm")};
         //display array
         int count = 1 ;
        
            for (Interface Interface11 : Interface1) {
                System.out.println(Interface11);
            }
            
            System.out.println("\nPlease Select Concert : ");
          
       
        
       
       }
        
        public static void DisplayTicket(){
            Scanner scan = new Scanner(System.in);
            System.out.println("\n1.CAT 1 [900] \n2.CAT 2 [800] \n3.CAT 3 [700] "
                                 + "\n4.CAT 4 [600] \n5.CAT 5 [500]\n");
            
            System.out.println("Please Select the type of ticket : ");
            int ticket = scan.nextInt();
            SelectTicket(ticket);
             
           
            
            
            
          }
    }
