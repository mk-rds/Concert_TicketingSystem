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
public class Record {
    private user user;
    private TicketSystem TicketSystem;

    public Record(user user,TicketSystem TicketSystem) {
        this.user = user;
        this.TicketSystem = TicketSystem;
    }

    @Override
    public String toString() {
        return "\t\t\t\t\t\t\t\tRECORD" 
                + "\n\t\t\t\t----------------------------------------------------------------------" 
                + "\n" +  TicketSystem + user + "\n";
    }
}