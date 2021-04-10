/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaldemo;



public class user {
  
    private String name;
    private String password;
    private String email;

    public user() {
    }

    
    public user(String name,String email,String password) {
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\n\n\t\t\t\tUsername\t: " + name + "\n\t\t\t\tPassword\t: " + password + "\n\t\t\t\tEmail\t\t: " + email;
    }

   
}