/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;
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
    private boolean Merchandise;
    private double quantity; //the quantity of ticket user choose

    public Interface() {
    }

    public Interface(String concert_name, String concert_time, int ticket_stock, int ticket, boolean Merchandise,double quantity) {
        this.concert_name = concert_name;
        this.concert_time = concert_time;
        Interface.ticket_stock = ticket_stock;
        this.ticket = ticket;
        this.Merchandise = Merchandise;
        this.quantity = quantity;
  
    }

    public Interface(String concert_name, String concert_time, int ticket) {
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

    public boolean isMerchandise() {
        return Merchandise;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    

    @Override
    public String toString() {
        return "\n Concert Details : "+concert_name +", "+ concert_time +"\n Ticket Available : "+ ticket  + "\n Merchandise :"+Merchandise ;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       //display method,selection
       
        System.out.println("\tConcert Available");
        // ticket array
         Interface[] Interface1 ={new Interface("Coldplay","2 March 2021 , 7pm",100),
                                  new Interface("Alan Walker","24 August 2021 , 7pm ",100),
                                  new Interface("Taylor Swift","13 December 2021 , 7pm",100)};
         
         int count = 1 ;
        for (int i = 0 ; i < count ; i ++) {
            for (Interface Interface11 : Interface1) {
                System.out.println(Interface11);
            }
            
            // select concert
             Scanner scan =new Scanner(System.in);
        System.out.println("\nPlease Select Concert : ");
        int concert = scan.nextInt();
        
            switch (concert) {
                case 1:
                    System.out.println("You have selected ");
                    System.out.println(Interface1[concert-1]);
                    break;
                    
                case 2:
                    System.out.println("You have selected ");
                    System.out.println(Interface1[concert-1]);
                    break;
                            
                case 3:
                    System.out.println("You have selected ");
                    System.out.println(Interface1[concert-1]);
                    break;
                    
                default:
                    break;
            }
            
            // select ticket
       // while(ticket > 5 && 1 >= ticket){    
            System.out.println("1.CAT 1 [900] \n2.CAT 2 [800] \n3.CAT 3 [700] "
                                 + "\n4.CAT 4 [600] \n5.CAT 5 [500]\n");
            System.out.println("Please Select the type of ticket : ");
            
            int ticket = scan.nextInt();
            
            switch (ticket){
                case 1:
                  ticket = 800;
                  break;
                    //TicketPrice_CAT1(quantity);
                    
                case 2:
                    ticket = 500 ;
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
        
        
            
            //select ticket quantity
            System.out.println("Please enter the quantity of ticket : ");
            int ticket1 = scan.nextInt();
            
           // if (ticket1<0 && ticket 1 >= 100){
            int total = ticket * ticket1;
            System.out.println("Total need to pay :" + total);
           // }   
        }
        }
        
       
        
        
    }
    

