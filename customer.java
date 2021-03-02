/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class customer {
    private String password = "abc123";
    private String username = "hanshen";
   
    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
    public static void login_verification(){
        Scanner input = new Scanner(System.in);
        customer cus = new customer();
        
            System.out.print("enter your username :");
            cus.setUsername(input.nextLine());
            System.out.print("enter your password :");
            cus.setPassword(input.nextLine());
            
        if(cus.getUsername().equals("hanshen") && cus.getPassword().equals("abc123")){
            System.out.print("login successfull");
            
        }
        
        else{
            System.out.print("wrong input , try again\n");
            login_verification();
        }
       
        
        
   
    
    
    

    }
}


    
    
       
        
    
       
        
        
        
       
        
   


