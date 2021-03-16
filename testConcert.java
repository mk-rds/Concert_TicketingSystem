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
public class testConcert {
    public static void main(String[] args){
        System.out.print("\n[1] BLACKPINK CONCERT");
        System.out.print("\n[2] JAYCHOU CONCERT");
        System.out.print("\n[3] TAYLOR SWIFT CONCERT\n");
        int option,choose;
        Scanner input = new Scanner(System.in);
        System.out.print("Please select a concert :");
        option = input.nextInt();
        
        switch(option){
            case 1: blackpink blackpink = new blackpink("BLACKPINK CONCERT","19:00","March 2 2021");
                    System.out.print(blackpink.toString());
                    blackpink.DisplayTicketBP();
                    break;
        
            case 2:Jay Jay = new Jay("JAYCHOU CONCERT","19:00","August 24 2021");
                   System.out.print(Jay.toString());
                   Jay.DisplayTicketJay();
                   break;
        
            case 3:Taylor Taylor = new Taylor("TAYLOR CONCERT","19:00","December 13 2021");
                   System.out.print(Taylor.toString());
                   Taylor.DisplayTicketTaylor();
                   break;
    }
    }
}
