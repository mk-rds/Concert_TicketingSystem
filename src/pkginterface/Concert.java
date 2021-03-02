/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author mingkit
 */
public class Concert {
    private Interface Interface;

    public Concert() {
    }

    public Concert(Interface Interface) {
        this.Interface = Interface;
    }

    @Override
    public String toString() {
        return "Concert{" + "Interface=" + Interface + '}';
    }
    
    
}

