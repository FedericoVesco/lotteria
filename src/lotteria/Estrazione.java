/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author federico veschini
 */
public class Estrazione extends Thread {
    // attributi
    private int[][] numeri = new int[10][10];
    int[] vincitori = new int[3];
    private List<Integer> numeroVincitori = new ArrayList<Integer>();
    private Random random = new Random();
    /**
     * 
     * Metodo costruttore
     */
    public Estrazione() {    
        
        for(int n = 0; n<10; n++){
            for(int m = 0; m<10; m++){
                numeri[n][m] = random.nextInt(100);
                
            }
        }
        // stampa matrice dei numeri estratti
    }

    /**
     *
     * Metodo per visualizzare la matrice dei numeri estratti
     */
    public void stampaMatrice() {
        // stampa matrice dei numeri estratti
 	for (int n = 0; n < 10; n++) {
            for (int m = 0; m < 10; m++) {
                System.out.print(numeri[n][m] + "\t");
            }
            System.out.println();
        }
    }
    
    /**
    * 
    * Metodo per visualizzare i vincitori dell'estrazione
    */
    public void stampaVincitori() {
        // stampa array dei vincitori
	System.out.println("Vincitori: ");
        for (int vincitore : vincitori) {
            System.out.print(vincitore + " ");
        }
        System.out.println();
        }

    /**
    * 
    * Metodo per verificare il numero scelto dal giocatore e determinare i vincitori
    */
    public void verifica(int numero, int idGiocatore) {
       for(int i = 0; i<10; i++){
           for(int j=0; j<10; j++){
               if(numero==numeri[i][j]){
                   numeroVincitori.add(idGiocatore);
                   System.out.println("Giocatore " + idGiocatore + " hai scelto il numero " + numero + " e hai vinto!");
                   return;
               }
            }
        }
        System.out.println("Giocatore " + idGiocatore + " hai perso!");

    }

    /**
    * 
    * Metodo per eseguire il thread
    */
    public void run() {
        // stampa iniziale
        System.out.println("INIZIO ESTRAZIONE!");
        
        // estrazione dei numeri
        // stampa matrice
        // stampa finale    
        System.out.println("FINE ESTRAZIONE!");
    }
}


