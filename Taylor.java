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
public class Taylor extends Concert {
    public Taylor(){
        
    }
    public Taylor(String concert_name,String concert_time,String concert_date) {
        setConcert_name(concert_name);
        setConcert_time(concert_time);
        setConcert_date(concert_date);
    }
    
    
    @Override
    public String toString(){
        return super.toString();
    }
}
