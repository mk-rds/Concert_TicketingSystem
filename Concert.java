/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author User
 */
public class Concert {
    private String concert_name;
    private String concert_time;
    private String concert_date;
   

    public Concert(){
        
    }

    public Concert(String concert_name, String concert_time, String concert_date) {
        this.concert_name = concert_name;
        this.concert_time = concert_time;
        this.concert_date = concert_date;
    }

    public String getConcert_date() {
        return concert_date;
    }

    public void setConcert_date(String concert_date) {
        this.concert_date = concert_date;
    }
    
    public String getConcert_name() {
        return concert_name;
    }

    public void setConcert_name(String concert_name) {
        this.concert_name = concert_name;
    }

    public String getConcert_time() {
        return concert_time;
    }

    public void setConcert_time(String concert_time) {
        this.concert_time = concert_time;
    }

    @Override
    public String toString() {
        return "\nConcert Name : " + concert_name + "\n" + "Concert time : " + concert_time + "\n" + "Concert date : " + concert_date + "\n"; 
    }

    
    
    
    
}
