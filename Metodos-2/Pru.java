import java.util.*;


public class Pru{

    Scanner entrada = new Scanner(System.in);
    String Nombre_Cliente;
    String[] Producto = new String[10];
    int[] Costo = new int[10];
    int[] ProductoE = new int[10];
    double m=0;
    double n=0;
    double s=0;
    double t=0;
    int i;

    public void Suma(){
        System.out.println("Bienvenido a el sistema de Proveedores de productos, ingresa tu nombre porfavor");
        Nombre_Cliente=entrada.nextLine();
        System.out.println("Hola de nuevo " +Nombre_Cliente+ " que deseas comprar");
        for(i = 0; i < Producto.length; i++){
        System.out.println("Producto" +(i+1)+ ".");
        Producto[i]=entrada.nextLine();
    }
        for(i = 0; i < Costo.length; i++){
            System.out.println(" Pon el precio de los productos que deseas comprar ");
            System.out.println("Producto " +Producto[i]+ ".");
            Costo[i]=entrada.nextInt();
            s=s+Costo[i];
            System.out.println("La suma de los costos es " +s);
    
        if(Costo[i] > m){
            m=Costo [i];
            System.out.println("el costo mas alto es "+m);
     
            }    
        }
        
        for(i = 0; i < Costo.length; i++){
            if(Costo[i] < t){
                t=Costo [i];
                System.out.println("el costo mas bajo es "+t);
            }
        }
  
            System.out.println("ingresa el numero de unidades existentes de este objeto");
  
        for(i = 0; i < ProductoE.length; i++){
            System.out.println("Producto " +Producto[i]+ ".");
            ProductoE[i]=entrada.nextInt();
            m=m+ProductoE[i];
            n= m/ProductoE[i];
            System.out.println("El promedio de los productos es: " +n);
        }
    }
}

