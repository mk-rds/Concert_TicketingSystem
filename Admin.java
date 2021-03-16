/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import static Assignment.Merchandise2.bpshirtTotal;
import static Assignment.Merchandise2.jaychouTotal;
import static Assignment.Merchandise2.runningTotal;
import static Assignment.Merchandise2.tsTotal;
import static assignment.Calc_payment.TicketSold;
import static assignment.Calc_payment.revenue;
import static assignment.Interface.totalBP;
import static assignment.Interface.totalJay;
import static assignment.Interface.totalTaylor;
import static assignment.StockRemaining.bp_cat1;
import static assignment.StockRemaining.bp_cat2;
import static assignment.StockRemaining.bp_cat3;
import static assignment.StockRemaining.bp_cat4;
import static assignment.StockRemaining.bp_cat5;
import static assignment.StockRemaining.jay_cat1;
import static assignment.StockRemaining.jay_cat2;
import static assignment.StockRemaining.jay_cat3;
import static assignment.StockRemaining.jay_cat4;
import static assignment.StockRemaining.jay_cat5;
import static assignment.StockRemaining.merch_1;
import static assignment.StockRemaining.merch_2;
import static assignment.StockRemaining.merch_3;
import static assignment.StockRemaining.taylor_cat1;
import static assignment.StockRemaining.taylor_cat2;
import static assignment.StockRemaining.taylor_cat3;
import static assignment.StockRemaining.taylor_cat4;
import static assignment.StockRemaining.taylor_cat5;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Admin {
    private String username ;
    private String password ;
    private String password2;
    private String username2;
    
   
    
    public Admin(String username,String password){
        this.username = username;
        this.password = password;
        
        
    }
    
    
    
    public Admin(){
        
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public void setUsername2(String username2) {
        this.username2 = username2;
    }

    public String getPassword2() {
        return password2;
    }

    public String getUsername2() {
        return username2;
    }
    
    
    
    
    
    public static void AdminInterface (){
        Scanner input = new Scanner(System.in);
        Admin admin = new Admin("khartus","abc123");
        System.out.println("\nWELCOME TO ADMIN INTERFACE");
        System.out.println("enter your username : ");
        String name;
        name = input.nextLine();
        System.out.println("enter your password : ");
        String pass;
        pass = input.nextLine();
        if(name.equals(admin.getUsername()) && pass.equals(admin.getPassword())){
            System.out.print("welcome back " + admin.getUsername());
            DisplayFinancial();
        }
        
        else{
            System.out.print("wrong input");
            System.out.println("\n[1] FORGOT PASSWORD");
            System.out.println("[2] FORGOT USERNAME");
        }
       
        
        int option = input.nextInt();
        
        switch (option) {
                case 1:
                    input.nextLine();
                    System.out.print("new password :");
                    admin.setPassword(input.nextLine());
                    System.out.println("enter your username : ");
                    name = input.nextLine();
                    System.out.println("enter your password : ");
                    pass = input.nextLine();
                    if(name.equals(admin.getUsername()) && pass.equals(admin.getPassword())){
                        System.out.print("welcome back " + admin.getUsername());
                        DisplayFinancial();
                    }
                    
                    else{
                        System.out.print("wrong input");
                        AdminInterface();
                        
                    }           break;
                case 2:
                    input.nextLine();
                    System.out.print("new username :");
                    admin.setUsername(input.nextLine());
                    System.out.println("enter your username : ");
                    name = input.nextLine();
                    System.out.println("enter your password : ");
                    pass = input.nextLine();
                    if(name.equals(admin.getUsername()) && pass.equals(admin.getPassword())){
                        System.out.print("welcome back " + admin.getUsername());
                        DisplayFinancial();
                    }
                    
                    else{
                        System.out.print("wrong input");
                        AdminInterface();
                    }           break;
                default:
                    System.out.print("wrong input");
                    AdminInterface();
                    break;
            }
        
        
        
        
        
        
        
        
       
               
    
    }
    
    public static void DisplayFinancial(){
        Scanner input = new Scanner(System.in);
        int BPticketSold  = 500 - (int)(bp_cat1+bp_cat2+bp_cat3+bp_cat4+bp_cat5);
        int JAYticketSold  = 500 - (int)(jay_cat1+jay_cat2+jay_cat3+jay_cat4+jay_cat5);
        int TAYLORticketSold  = 500 - (int)(taylor_cat1+taylor_cat2+taylor_cat3+taylor_cat4+taylor_cat5);
        
        System.out.println("\n[1] BLACKPINK");
        System.out.println("[2] JAYCHOU");
        System.out.println("[3] TAYLOR SWIFT");
        System.out.println("[4] MERCHANDISE");
        System.out.println("[5] FINANCIAL REPORT");
        System.out.print("select concert financial :");
        int option = input.nextInt();
        switch(option){
            case 1: 
                System.out.println("BLACKPINK CONCERT");
                System.out.println("TICKET CAT1 SOLD : " + (int)(100-bp_cat1));
                System.out.println("TICKET CAT2 SOLD : " + (int)(100-bp_cat2));
                System.out.println("TICKET CAT3 SOLD : " + (int)(100-bp_cat3));
                System.out.println("TICKET CAT4 SOLD : " + (int)(100-bp_cat4));
                System.out.println("TICKET CAT5 SOLD : " + (int)(100-bp_cat5));
                System.out.println("total ticket sold : " + BPticketSold);
                System.out.println("the total revenue in blackpink concert is :" + totalBP);
                DisplayFinancial();
                break;
                
            case 2:
                System.out.println("JAYCHOU CONCERT");
                System.out.println("TICKET CAT1 SOLD : " + (int)(100-jay_cat1));
                System.out.println("TICKET CAT2 SOLD : " + (int)(100-jay_cat2));
                System.out.println("TICKET CAT3 SOLD : " + (int)(100-jay_cat3));
                System.out.println("TICKET CAT4 SOLD : " + (int)(100-jay_cat4));
                System.out.println("TICKET CAT5 SOLD : " + (int)(100-jay_cat5));
                System.out.println("total ticket sold : " + JAYticketSold);
                System.out.println("the total revenue in blackpink concert is :" + totalJay);
                DisplayFinancial();
                break;
                
            case 3 :
                System.out.println("BLACKPINK CONCERT");
                System.out.println("TICKET CAT1 SOLD : " + (int)(100-taylor_cat1));
                System.out.println("TICKET CAT2 SOLD : " + (int)(100-taylor_cat2));
                System.out.println("TICKET CAT3 SOLD : " + (int)(100-taylor_cat3));
                System.out.println("TICKET CAT4 SOLD : " + (int)(100-taylor_cat4));
                System.out.println("TICKET CAT5 SOLD : " + (int)(100-taylor_cat5));
                System.out.println("total ticket sold : " + TAYLORticketSold);
                System.out.println("the total revenue in blackpink concert is :" + totalTaylor);
                DisplayFinancial();
                break;
            case 4:
                System.out.println("MERCHANDISE");
                System.out.println("\nBLACKPINK SIGNED T-SHIRTS");
                System.out.println("total quantity : " + (int)(100-merch_1));
                System.out.println("total revenue : " + bpshirtTotal);
                
                System.out.println("\nJAYCHOU ACTION FIGURE");
                System.out.println("total quantity : " + (int)(100-merch_3));
                System.out.println("total revenue : " + jaychouTotal);
                
                System.out.println("\nTAYLOR SWIFT SIGNED VINYL ALBUM RECORDS");
                System.out.println("total quantity : " + (int)(100-merch_2));
                System.out.println("total revenue : " + tsTotal);
                
                System.out.println("TOTAL MERCHANDISE NET REVENUE : " + runningTotal);
                break;
                        
                
            case 5:
                System.out.println("\nFINANCIAL REPORT");
                System.out.println("\nBlACKPINK CONCERT" );
                System.out.println("TICKET SOLD :" + BPticketSold);
                System.out.println("TOTAL REVENUE :" + totalBP);
                System.out.println("\nJAY CHOU CONCERT" );
                System.out.println("TICKET SOLD :" + JAYticketSold);
                System.out.println("TOTAL REVENUE :" + totalJay);
                System.out.println("\nTAYLOR SWIFT CONCERT" );
                System.out.println("TICKET SOLD :" + TAYLORticketSold);
                System.out.println("TOTAL REVENUE :" + totalTaylor);
                
                System.out.println("\n\nTOTAL TICKET SOLD : " + (TicketSold/2));
                System.out.println("NET REVENUE IS : " + (revenue/2));
                System.exit(0);
                break;
                
            default:
                System.out.print("wrong input");
                
                break;
        }
        
        
    }
    
}
