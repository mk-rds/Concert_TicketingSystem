/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author User
 */
public class Receipt {
    public static double seat;
    public static String concert_name;
    public static double quantity;
    public static double total;
    public static double seatNum;
    
    
    
    
    public static void DisplayPosition(int ticket,int option ,double quantity){
        
        System.out.println("quantity :" + (int)quantity);
       
    }
    
    public static void DisplaySeatBP(int option ,double quantity){
        
     
                switch(option){
                    case 1: for(int i=0;i<quantity;i++){
                            System.out.println("\n"+(i+1) + "ticket selected A00" + (int)seatNum++);
                            
                            }
                            break;
                    case 2: for(int i=0;i<quantity;i++){
                            System.out.println("\n"+(i+1) + "ticket selected B00"+(int)seatNum++);
                            
                            }
                            break;
                    case 3: for(int i=0;i<quantity;i++){
                            System.out.println("\n"+(i+1) + "ticket selected C00"+(int)seatNum++);
                           
                            }
                            break;
                    case 4: for(int i=0;i<quantity;i++){
                            System.out.println("\n"+(i+1) + "ticket selected D00"+(int)seatNum++);
                           
                            }
                            break;        
                    case 5: for(int i=0;i<quantity;i++){
                            System.out.println("\n"+(i+1) + "ticket selected E00"+(int)seatNum++);
                            
                            }
                            break;

            }
    }
    
     public static void DisplaySeatJay(int option ,double quantity){
                switch(option){
                    case 1: for(int i=0;i<quantity;i++){
                            System.out.println("\n"+(i+1) + "ticket selected A00"+(int)seatNum++);
                            
                            }
                            break;
                    case 2: for(int i=0;i<quantity;i++){
                            System.out.println("\n"+(i+1) + "ticket selected B00"+(int)seatNum++);
                           
                            }
                            break;
                    case 3: for(int i=0;i<quantity;i++){
                            System.out.println("\n"+(i+1) + "ticket selected C00"+(int)seatNum++);
                            
                            }
                            break;
                    case 4: for(int i=0;i<quantity;i++){
                            System.out.println("\n"+(i+1) + "ticket selected D00"+(int)seatNum++);
                           
                            }
                            break;        
                    case 5: for(int i=0;i<quantity;i++){
                            System.out.println("\n"+(i+1) + "ticket selected E00"+(int)seatNum++);
                            
                            }
                            break;
     }

            }
     public static void DisplaySeatTaylor(int option ,double quantity){
                switch(option){
                    case 1: for(int i=0;i<quantity;i++){
                            System.out.println("\n"+(i+1) + "ticket selected A00"+(int)seatNum++);
                            
                            }
                            break;
                    case 2: for(int i=0;i<quantity;i++){
                            System.out.println("\n"+(i+1) + "ticket selected B00"+(int)seatNum++);
                           
                            }
                            break;
                    case 3: for(int i=0;i<quantity;i++){
                            System.out.println("\n"+(i+1) + "ticket selected C00"+(int)seatNum++);
                            
                            }
                            break;
                    case 4: for(int i=0;i<quantity;i++){
                            System.out.println("\n"+(i+1) + "ticket selected D00"+(int)seatNum++);
                           
                            }
                            break;        
                    case 5: for(int i=0;i<quantity;i++){
                            System.out.println("\n"+(i+1) + "ticket selected E00"+(int)seatNum++);
                            
                            }
                            break;

            }
        }
                
    }

        
       
        
    
    
    
    
     
    
    
    
    
        
        
        
        
        
       
        
        
        
   
    

