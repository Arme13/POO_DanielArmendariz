/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Herencia.Animal;
import Herencia.Delfin;
import Herencia.Perro;


/**
 *
 * @author dany_
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal perro = new Animal("Carne", "Desconocida", "Animal", 20, 0.90, "Canis lupus");
        Perro perro1 = new Perro("Carne", "Labrador", "Animal", 35, 0.60, 
                                 "Labrador retriever", 2, "Doggi", 14);
        Delfin pancho = new Delfin("Peces", "Desconocida", "Animal", 250, .6, "Delphinidae", "Cetaceo", 500);
        
        System.out.println(perro.getNombre_cientifico());
        
    }
    
}
