/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Scanner;

/**
 *
 * @author mingkit
 */
public class Interface {


    
    private String concert_name;
    private String concert_time;
    private static int ticket_stock;
    private int ticket;
    private double quantity; //the quantity of ticket user choose
    private int index;
    public Interface() {
    }

    public Interface(String concert_name, String concert_time, int ticket_stock, int ticket,double quantity) {
        this.concert_name = concert_name;
        this.concert_time = concert_time;
        Interface.ticket_stock = ticket_stock;
        this.ticket = ticket;
        this.quantity = quantity;
  
    }

    public Interface(int index,String concert_name, String concert_time, int ticket) {
        this.index = index;
        this.concert_name = concert_name;
        this.concert_time = concert_time;
        this.ticket = ticket;
    }

    public String getConcert_name() {
        return concert_name;
    }

    public String getConcert_time() {
        return concert_time;
    }

    public int getTicket_stock() {
        return Interface.ticket_stock - this.ticket;
    }

    public int getTicket() {
        return ticket;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    

    @Override
    public String toString() {
        return "\n"+index + ".Concert Details : "+concert_name +", "+ concert_time +"\n Ticket Available : "+ ticket  ;
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
         Interface[] Interface1 ={new Interface(1,"Blackpink","2 March 2021 , 7pm",100),
                                  new Interface(2,"Jay Chou","24 August 2021 , 7pm ",100),
                                  new Interface(3,"Taylor Swift","13 December 2021 , 7pm",100)};
         //display array
         int count = 1 ;
        for (int i = 0 ; i < count ; i ++) {
            for (Interface Interface11 : Interface1) {
                System.out.println(Interface11);
            }
          
        System.out.println("\nPlease Select Concert : ");
            int concert = scan.nextInt();
            Selectconcert(concert);
           
            // prompt user to select ticket type
       // while(ticket > 5 && 1 >= ticket){    
       
            System.out.println("1.CAT 1 [900] \n2.CAT 2 [800] \n3.CAT 3 [700] "
                                 + "\n4.CAT 4 [600] \n5.CAT 5 [500]\n");
            
            System.out.println("Please Select the type of ticket : ");
            int ticket = scan.nextInt();
            Selectticket(ticket);
             
            //prompt user to select ticket quantity
            System.out.println("Please enter the quantity of ticket : ");
            int ticket1 = scan.nextInt();
            
         //prompt user whether wanna add tickets
            System.out.println("Do you want to add on ticket ? \n 1.YES \n 2. Continue to Payment");
            int addon = scan.nextInt();
                addon(addon);   
        }
        }
        
        public static void Selectconcert(int x) {
             Interface[] Interface1 ={new Interface(1,"Blackpink","2 March 2021 , 7pm",100),
                                  new Interface(2,"Jay Chou","24 August 2021 , 7pm ",100),
                                  new Interface(3,"Taylor Swift","13 December 2021 , 7pm",100)};
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
        
        public static void Selectticket(int y){
            double ticket;
         switch (y){
             
                case 1:
                  ticket = 900.00;
                  break;
                    //TicketPrice_CAT1(quantity);
                    
                case 2:
                    ticket = 800/00 ;
                    //TicketPrice_CAT2(quantity);
                    break;
                    
                case 3:
                    
                    //TicketPrice_CAT3(quantity);
                    break;
                    
                case 4:
                    
                   // TicketPrice_CAT4(quantity);
                   break;
                case 5:
                    
                    //TicketPrice_CAT5(quantity);
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
            Selectticket(ticket);
             
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
        //display array
       public static void displayConcert(){
            System.out.println("\tConcert Available");
        // ticket array
         Interface[] Interface1 ={new Interface(1,"Blackpink","2 March 2021 , 7pm",100),
                                  new Interface(2,"Jay Chou","24 August 2021 , 7pm ",100),
                                  new Interface(3,"Taylor Swift","13 December 2021 , 7pm",100)};
         //display array
         int count = 1 ;
        
            for (Interface Interface11 : Interface1) {
                System.out.println(Interface11);
            }
       
          public static void DisplayTicket(){
            System.out.println("1.CAT 1 [900] \n2.CAT 2 [800] \n3.CAT 3 [700] "
                                 + "\n4.CAT 4 [600] \n5.CAT 5 [500]\n");
            
            System.out.println("Please Select the type of ticket : ");
            int ticket = scan.nextInt();
            SelectTicket(ticket);
             
            //prompt user to select ticket quantity
            System.out.println("Please enter the quantity of ticket : ");
            int ticket1 = scan.nextInt();
          }
       
       
    
    }
