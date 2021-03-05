/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;
/**
 *
 * @author mingkit
 */
public class timer {
    static Thread tr = new Thread ();
    
    public static void main (String[] args){
       try{
       for (int t = 60 ; t> 0 ; t--){
           Thread.sleep(1000);
           System.out.println(t);
       }
       }catch(Exception e){  
           e.printStackTrace();
       }
       
    }
}
    