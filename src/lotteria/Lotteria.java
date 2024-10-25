/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteria;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author monica ciuchetti
 */
public class Lotteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scelta del numero dei numeri da estrarre
      
        // Istanza ed avvio del thread Estrazione
        Estrazione e = new Estrazione();
        e.start();
        
               
        // Istanza di alcuni thread Giocatore
        Giocatore g1 = new Giocatore(1,"nome",e);
        Giocatore g2 = new Giocatore(2,"Cagliesi",e);
        Giocatore g3 = new Giocatore(3,"Tosti",e);
        
        g1.start();
        g2.start();
        g3.start();
        
        try {
            //Giocatore g4 = new Giocatore(4,"nome",e);
            //Giocatore g5 = new Giocatore(5//,"nome",e);
            // Avvio dei thread Giocatori
            g1.join(0);
            g2.join(0);
            g3.join(0);
        } catch (InterruptedException ex) {
            Logger.getLogger(Lotteria.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Errore join");
        }
        // Comunicazione fine gioco
        System.out.println("FINE GIOCO");
    }
}
   