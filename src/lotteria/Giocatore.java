/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteria;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author monica ciuchetti
 */
public class Giocatore extends Thread{
    // attributi
    private int idGiocatore;
    private String nome;
    private Estrazione estrazione;
    private Random random = new Random();
    /**
    * 
    * Metodo costruttore
    * @param idGiocatore codice del giocatore
    * @param estrazione riferimento dell'oggetto Estrazione
    * @param nome nome del giocatore 
    */
    public Giocatore(int idGiocatore, String nome, Estrazione estrazione) {
        this.idGiocatore = idGiocatore;
        this.nome = nome;
        this.estrazione = estrazione;
       // scela del numero da giocare
       // verifica del risutlato
       // stampa fine verifica
    }

    /**
     *
     * Metodo per eseguire il thread
     */
    public void run() {
        // scelta del numero da giocare
        System.out.println("il giocatore:"+ idGiocatore + " con estrazione "+ this.estrazione + " INIZIO");
        int numeroScelto = random.nextInt(100);
        for(int i= 3; i>0;i--){
            System.out.println(i);
        }
        // verifica del risutlato

        estrazione.verifica(numeroScelto, idGiocatore);
        // stampa fine verifica
        System.out.println("Giocatore ID:"+idGiocatore+" ho verificato il numero - FINE");
        
    }
}
