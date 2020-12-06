/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizza;

import java.util.Scanner;
/**
 *
 * @author adrai
 */
public class Peperoni extends Pizza {

    public Peperoni() {
    }

        public Peperoni(String masa, String[] salsa, String[] ingredientes) {
            super(masa, salsa, ingredientes);
        
        this.ingredientes = new String[4];
        this.ingredientes[0] = "Rodajas";
        this.ingredientes[1] = "Rodajas con Parmesano";
        this.ingredientes[2] = "Rodajas y Albaca";
        this.ingredientes[3] = "Doble Peperoni en Rodajas";
        
    }

        public String elegirtipopeperoni(){
        //es un metodo void, o string?
        Scanner entrada = new Scanner(System.in);
        String peperoni;
        System.out.println("Elije el peperoni que deseas");
        System.out.println("1.- Rodajas");
        System.out.println("2.- Rodajas con Parmesano");
        System.out.println("3.- Rodajas y Albaca");
        System.out.println("4.- Doble Peperoni en Rodajas");
        peperoni = entrada.next();
        System.out.println("El precio de la Pizza de Peperoni es de $46");
        return peperoni;
    }
    
    
}
