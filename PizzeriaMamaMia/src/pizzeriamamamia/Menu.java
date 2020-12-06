/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeriamamamia;

import Pizza.Queso.*;
import Pizza.*;
import java.util.Scanner;
/**
 *
 * @author adrai
 */
public class Menu {
    
    public void MenuOperaciones() {
        
        Scanner entrada = new Scanner(System.in);
        int opc;
        String opcion = null;
        
        Pizza piza = null;
        do{
        
        System.out.println("Bienvenidos a la Pizzeria Los Tacos");
        System.out.println("¿Que desea ordenar?");
        System.out.println("Primero defina el tamaño de su Pizza");
        System.out.println("a.- Chica");
        System.out.println("b.- Mediana");
        System.out.println("c.- Grande");
        System.out.println("d.- Familiar");
        
        opcion = entrada.next();
        
        switch(opcion){
            case "a":
                System.out.println("Su Pizza es Chica");
                System.out.println("La Pizza se cortara en 4 partes");
                break;
                
            case "b":
                System.out.println("Su Pizza es Mediana");
                System.out.println("La Pizza se cortara en 8 partes");
                break;
                
            case "c":
                System.out.println("Su Pizza es Grande");
                System.out.println("La Pizza se cortara en 12 partes");
                break;
                
            case "d":
                 System.out.println("Su Pizza es Familiar");
                 System.out.println("La Pizza se cortara en 16 partes");
                 break;
        }
        
        
        
        System.out.println("Indique los ingredietes deseados");
        System.out.println("1.- Pizza de Queso");
        System.out.println("2.- Pizza de Peperoni");
        System.out.println("3.- Pizza Vegetariana");
        System.out.println("Gracias uwu");
        
        opc = entrada.nextInt();
        
        switch(opc){
            case 1:
                
                piza = new Queso();
                
                Queso ques = new Queso();
                ques.elegirtipoqueso();

                piza.hornear();
                piza.empacar();
                
                
                break;
            case 2:
                piza = new Peperoni();
                
                Peperoni pep = new Peperoni();
                pep.elegirtipopeperoni();
                
                piza.hornear();
                piza.empacar();
                
                break;
            case 3: 
                piza = new Vegetariana();
                
                Vegetariana vege = new Vegetariana();
                vege.elegirtipovegetariana();
                
                piza.hornear();
                piza.empacar();
                break;
                
            default:
            System.out.println("Hasta luego UnU");
        }
        if("a".equals(opcion) && opc == 1){
            System.out.println("Si su Pizza es de Queso Mozzarela el costo es de $75");
            System.out.println("Si su Pizza es de Queso Parmesano el costo es de $89");
        }else{
           if("b".equals(opcion) && opc == 1){
               System.out.println("Si su Pizza es de Queso Mozzarela el costo es de $89");
            System.out.println("Si su Pizza es de Queso Parmesano el costo es de $115");
           }else{
               if("c".equals(opcion) && opc == 1){
               System.out.println("Si su Pizza es de Queso Mozzarela el costo es de $112");
            System.out.println("Si su Pizza es de Queso Parmesano el costo es de $135");
           }else{
            if("d".equals(opcion) && opc == 1){
               System.out.println("Si su Pizza es de Queso Mozzarela el costo es de $135");
            System.out.println("Si su Pizza es de Queso Parmesano el costo es de $175");       
                        }        
                    }
                }  
            }  
        
        if("a".equals(opcion) && opc == 2){
            System.out.println("El costo de su Pizza es de $96");
        }else{
            if("b".equals(opcion) && opc == 2){
            System.out.println("El costo de su Pizza es de $119");
        }else{
                if("c".equals(opcion) && opc == 2){
            System.out.println("El costo de su Pizza es de $131");
        }else{
                    if("d".equals(opcion) && opc == 2){
                        System.out.println("El costo de su Pizza es de $167");
                    }
                }
            }
        }
        
                if("a".equals(opcion) && opc == 3){
            System.out.println("El costo de su Pizza es de $88");
        }else{
            if("b".equals(opcion) && opc == 3){
            System.out.println("El costo de su Pizza es de $97");
        }else{
                if("c".equals(opcion) && opc == 3){
            System.out.println("El costo de su Pizza es de $111");
        }else{
                    if("d".equals(opcion) && opc == 3){
                        System.out.println("El costo de su Pizza es de $157");
                    }
                }
            }
        }
        }while(opc != 4);
        
    }
    
}
