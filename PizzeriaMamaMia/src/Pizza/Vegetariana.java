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
public class Vegetariana extends Pizza {
    
    
    public Vegetariana() {
    }

    public Vegetariana(String masa, String[] salsa, String[] ingredientes) {
        super(masa, salsa, ingredientes);
        this.ingredientes = new String[4];
        this.ingredientes[0] = "Champiñones";
        this.ingredientes[1] = "Piña";
        this.ingredientes[2] = "Pimiento";
        this.ingredientes[3] = "Elote";
        
    }
    
            public String elegirtipovegetariana(){
        
        Scanner entrada = new Scanner(System.in);
        String vegetariana;
        System.out.println("Elije el ingrediente que deseas");
        System.out.println("1.- Champiñones");
        System.out.println("2.- Piña");
        System.out.println("3.- Pimiento");
        System.out.println("4.- Elote");
        vegetariana = entrada.next();
        System.out.println("El precio de la Pizza Vegetariana es de $38");
        return vegetariana;
    }
    
    public Vegetariana(String masa){
        //aqui pueda modificar el comportamiento de la masa
    }

}
