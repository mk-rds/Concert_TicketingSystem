package assignment;

import static assignment.Calc_payment.TicketPrice_CAT1;
import static assignment.Calc_payment.TicketPrice_CAT2;
import static assignment.Calc_payment.TicketPrice_CAT3;
import static assignment.Calc_payment.TicketPrice_CAT4;
import static assignment.Calc_payment.TicketPrice_CAT5;
import static assignment.StockRemaining.BPstock_cat1;
import static assignment.StockRemaining.BPstock_cat2;
import static assignment.StockRemaining.BPstock_cat3;
import static assignment.StockRemaining.BPstock_cat4;
import static assignment.StockRemaining.BPstock_cat5;
import static assignment.StockRemaining.Jaystock_cat1;
import static assignment.StockRemaining.Jaystock_cat2;
import static assignment.StockRemaining.Jaystock_cat3;
import static assignment.StockRemaining.Jaystock_cat4;
import static assignment.StockRemaining.Jaystock_cat5;
import static assignment.StockRemaining.Taylorstock_cat1;
import static assignment.StockRemaining.Taylorstock_cat2;
import static assignment.StockRemaining.Taylorstock_cat3;
import static assignment.StockRemaining.Taylorstock_cat4;
import static assignment.StockRemaining.Taylorstock_cat5;
import java.util.Scanner;

/**
 *
 * @author mingkit
 */
public class Interface {

    private String concert_name;
    private String concert_time;
    private int index;

    public Interface() {
    }

    public Interface(String concert_name, String concert_time,int ticket) {
        this.concert_name = concert_name;
        this.concert_time = concert_time;
        Interface.ticket_stock = ticket_stock;

        this.quantity = quantity;

    }

    public Interface(int index, String concert_name, String concert_time) {
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

    public int getIndex() {
        return index;
    }

    

    @Override
    public String toString() {
        return "\n"+index + ".Concert Details : "+concert_name +", "+ concert_time +"\n Ticket Available : ";
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
        
        public static void DisplayTicketBP(){
            Scanner scan = new Scanner(System.in);
            System.out.println("\n1.CAT 1 [900] \n2.CAT 2 [800] \n3.CAT 3 [700] "
                                 + "\n4.CAT 4 [600] \n5.CAT 5 [500]\n");
            
            System.out.println("Please Select the type of ticket : ");
            int ticket = scan.nextInt();
            
            BPSelectTicket(ticket);
            
             
           
            
            
            
          }
        
        public static void DisplayTicketJay(){
            Scanner scan = new Scanner(System.in);
            System.out.println("\n1.CAT 1 [900] \n2.CAT 2 [800] \n3.CAT 3 [700] "
                                 + "\n4.CAT 4 [600] \n5.CAT 5 [500]\n");
            
            System.out.println("Please Select the type of ticket : ");
            int ticket = scan.nextInt();
            
            JaySelectTicket(ticket);
            
             
           
            
            
            
          }
        
        public static void DisplayTicketTaylor(){
            Scanner scan = new Scanner(System.in);
            System.out.println("\n1.CAT 1 [900] \n2.CAT 2 [800] \n3.CAT 3 [700] "
                                 + "\n4.CAT 4 [600] \n5.CAT 5 [500]\n");
            
            System.out.println("Please Select the type of ticket : ");
            int ticket = scan.nextInt();
            
            TaylorSelectTicket(ticket);
            
             
           
            
            
            
          }
        
        //blackpink ticket
        public static void BPSelectTicket(int y){
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
                    BPstock_cat2(quantity1);
                    //TicketPrice_CAT2(quantity);
                    break;
                    
                case 3:
                    System.out.println("enter your quantity :");
                    double quantity2 = scan.nextDouble();
                    TicketPrice_CAT3(quantity2);
                    BPstock_cat3(quantity2);
                    break;
                    
                case 4:
                    System.out.println("enter your quantity :");
                    double quantity3 = scan.nextDouble();
                    TicketPrice_CAT4(quantity3);
                    BPstock_cat4(quantity3);
                   break;
                   
                case 5:
                    System.out.println("enter your quantity :");
                    double quantity4 = scan.nextDouble();
                    TicketPrice_CAT5(quantity4);
                    BPstock_cat5(quantity4);
                    break;
                    
                default :
                    System.out.println("Type again");
                    break;
            }
      
        }
                //Jaychou ticket
            public static void JaySelectTicket(int y){
           Scanner scan  = new Scanner(System.in);
           
         switch (y){
             
                case 1:
                  System.out.println("enter your quantity :");
                  double quantity = scan.nextDouble();
                  TicketPrice_CAT1(quantity);
                  Jaystock_cat1(quantity);
                  break;
                    //TicketPrice_CAT1(quantity);
                    
                case 2:
                    System.out.println("enter your quantity :");
                    double quantity1 = scan.nextDouble();
                    TicketPrice_CAT2(quantity1);
                    Jaystock_cat2(quantity1);
                    //TicketPrice_CAT2(quantity);
                    break;
                    
                case 3:
                    System.out.println("enter your quantity :");
                    double quantity2 = scan.nextDouble();
                    TicketPrice_CAT3(quantity2);
                    Jaystock_cat3(quantity2);
                    break;
                    
                case 4:
                    System.out.println("enter your quantity :");
                    double quantity3 = scan.nextDouble();
                    TicketPrice_CAT4(quantity3);
                    Jaystock_cat4(quantity3);
                   break;
                   
                case 5:
                    System.out.println("enter your quantity :");
                    double quantity4 = scan.nextDouble();
                    TicketPrice_CAT5(quantity4);
                    Jaystock_cat5(quantity4);
                    break;
                    
                default :
                    System.out.println("Type again");
                    break;
            }
      
        }
                //Taylor ticket
            public static void TaylorSelectTicket(int y){
           Scanner scan  = new Scanner(System.in);
           
         switch (y){
             
                case 1:
                  System.out.println("enter your quantity :");
                  double quantity = scan.nextDouble();
                  TicketPrice_CAT1(quantity);
                  Taylorstock_cat1(quantity);
                  break;
                    //TicketPrice_CAT1(quantity);
                    
                case 2:
                    System.out.println("enter your quantity :");
                    double quantity1 = scan.nextDouble();
                    TicketPrice_CAT2(quantity1);
                    Taylorstock_cat2(quantity1);
                    //TicketPrice_CAT2(quantity);
                    break;
                    
                case 3:
                    System.out.println("enter your quantity :");
                    double quantity2 = scan.nextDouble();
                    TicketPrice_CAT3(quantity2);
                    Taylorstock_cat3(quantity2);
                    break;
                    
                case 4:
                    System.out.println("enter your quantity :");
                    double quantity3 = scan.nextDouble();
                    TicketPrice_CAT4(quantity3);
                    Taylorstock_cat4(quantity3);
                   break;
                   
                case 5:
                    System.out.println("enter your quantity :");
                    double quantity4 = scan.nextDouble();
                    TicketPrice_CAT5(quantity4);
                    Taylorstock_cat5(quantity4);
                    break;
                    
                default :
                    System.out.println("Type again");
                    break;
            }
      
        }
    }
