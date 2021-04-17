/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaldemo;

/**
 *
 * @author User
 */
public class TicketSystem {
    private Concert Concert;
    private String type;
    private int quantity;
    private int total;

    public TicketSystem(Concert Concert, String type, int quantity,int total) {
        this.Concert = Concert;
        this.type = type;
        this.quantity = quantity;
        this.total = total;
    }

    @Override
    public String toString() {
        
        return "\t\t\t\tConcert Name\t" + "Concert Time\t" + "Type of ticket\t" + "Quantity\t" + "Total\t" + "\n\t\t\t\t" 
                + Concert.getConName() + "\t" + Concert.getConTime() + "\t" + type + "\t\t" + quantity + "\t\t" + total;
        
                
        
    }
}