import java.util.*;

public class Datos{

    Scanner entrada = new Scanner(System.in);

    int credito, numcel;
    double resultado;

    public void Data(){

        System.out.println("Bienvenido al calculo de credito y costo de llamadas");
        System.out.println("Ingrese su credito");
        credito = entrada.nextInt();
        System.out.println("Su credito es de: "+credito);
        System.out.println("Ingrese el tipo de llamada que quiere realizar");
        System.out.println("1.- Locales nacionales");
        System.out.println("2.- Locales internacionales");
        System.out.println("3.- Celulares");
        numcel = entrada.nextInt();

        if(numcel == 1){
            resultado = credito - 0.5;
            System.out.println("El costo de su llamada fue de $0.5 y se desconto se cu credito: "+resultado);
        }
        if(numcel == 2){
            resultado = credito - 0.6;
            System.out.println("El costo de su llamada fue de $0.6 y se desconto se cu credito: "+resultado);
        }
        if(numcel == 3){
            resultado = credito - 0.2;
            System.out.println("El costo de su llamada fue de $0.2 y se desconto se cu credito: "+resultado);
        }
    }
}