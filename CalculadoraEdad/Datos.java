import java.util.*;

public class Datos{

    Scanner entrada = new Scanner(System.in);

    String nombre, lugarN;
    int aN = 0;
    int aA = 0;
    int edad = 0;

    public void Data(){

        System.out.println("Bienvenido al sistema de calculadora de edad, primero dinos tu nombre");
        nombre = entrada.nextLine();
        System.out.println("De donde eres?");
        lugarN = entrada.nextLine();
        System.out.println("En que anio naciste?");
        aN = entrada.nextInt();
        System.out.println("Ingresa el anio deseado para mostrar tu edad");
        aA = entrada.nextInt();
    }

    public void Suma(){

        edad = aA - aN;
        System.out.println("Tu edad en el anio inscrito es: " +edad+ " anios.");
    }
}