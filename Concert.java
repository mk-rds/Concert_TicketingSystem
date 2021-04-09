/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaldemo;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Concert {
     private String conName;
    private String conTime;
    private String conDesc;
    private String conDest;
    private String conArtist;
    private ticket ticket;

    public Concert() {

    }

    public Concert(String conName, String conTime, String conDesc, String conDest, String conArtist,ticket ticket) {
        this.conName = conName;
        this.conTime = conTime;
        this.conDesc = conDesc;
        this.conDest = conDest;
        this.conArtist = conArtist;
        this.ticket = ticket;
    }

   

    public Concert(String conName){
        this.conName = conName;
    }

    public ticket getTicket() {
        return ticket;
    }

    public void setTicket(ticket ticket) {
        this.ticket = ticket;
    }
    
    public String getConName() {
        return conName;
    }

    public void setConName(String conName) {
        this.conName = conName;
    }

    public String getConTime() {
        return conTime;
    }

    public void setConTime(String conTime) {
        this.conTime = conTime;
    }

    public String getConDesc() {
        return conDesc;
    }

    public void setConDesc(String conDesc) {
        this.conDesc = conDesc;
    }

    public String getConDest() {
        return conDest;
    }

    public void setConDest(String conDest) {
        this.conDest = conDest;
    }

    public String getConArtist() {
        return conArtist;
    }

    public void setConArtist(String conArtist) {
        this.conArtist = conArtist;
    }


    @Override
    public String toString() {
        return "\n\t\t\t\t\t\t\t\t" + conName 
                + "\n\n\t\t\t     Artist\t\t: " + conArtist + "\t\t\t Time\t: " + conTime 
                + "\n\t\t\t     Destination\t: " + conDest + "\n\t\t\t     Description\t: " + conDesc+"\n\n                             Available Tickets\t:" + ticket;
    }


    
    public void printSongListBP() {
        ArrayList<String> songList = new ArrayList<>();
        songList.add("\n\t\t\t\t\t\t\t   SONGS PERFORMING\t\n\n\t\t\t\t\t\t |\t'Kill This Love'\t\t|");
        songList.add("\t\t\t\t\t\t |\t'Don't Know What to Do'\t\t|");
        songList.add("\t\t\t\t\t\t |\t'Kick It'\t\t\t|");
        songList.add("\t\t\t\t\t\t |\t'Hope Not'\t\t\t|");
        songList.add("\t\t\t\t\t\t |\t'Ddu-Du Ddu-Du'\t\t\t|");

        for (int i = 0; i <= songList.size() - 1; i++) {

            System.out.println(songList.get(i));

        }
    }
     public void printSongListJay() {
        ArrayList<String> songList = new ArrayList<>();
        songList.add("\n\t\t\t\t\t\t\t   SONGS PERFORMING\t\n\n\t\t\t\t\t\t |\t'Mojito'\t\t|");
        songList.add("\t\t\t\t\t\t |\t'Won't Cry'\t\t|");
        songList.add("\t\t\t\t\t\t |\t'Love Confession'\t\t|");
        songList.add("\t\t\t\t\t\t |\t'Waiting For You'\t\t|");
        songList.add("\t\t\t\t\t\t |\t'Silence'\t\t\t|");

        for (int i = 0; i <= songList.size() - 1; i++) {

            System.out.println(songList.get(i));

        }
       

    }
}
