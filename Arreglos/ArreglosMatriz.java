import java.util.*;
    
class ArreglosMatriz{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int opcion;
        int i, j, numAlum;
        int p = 0;
        int n = 0;  
        double resultado, media, suma = 0;
        double sumaN = 0;
        double sumaP = 0;
        double promedio = 0;

        /*Profe una disculpa que no los haya hecho con metodos, pero es que no me funcionaba el código
        y para que me pudiera funcionar lo hice con case ._. :c
       */
        
       boolean salir = false;
       boolean repetir = false;
        
       do{

            System.out.println("Bienvenido al menu :)");
            System.out.println("1.- Promedio de 10 numeros");
            System.out.println("2.- Promedio pares de 10 numeros");
            System.out.println("3.- Calificaciones");
            System.out.println("4.- Suma de matriz 3x3");

            opcion = entrada.nextInt();

            switch(opcion){
                case 1:
                    do{
                        int arreglo[] = new int[10];
                        System.out.println("Ingresa los numeros a leer");
                        for(i = 0; i < 10; i++){
                            System.out.print("numeros[" + i+"]= ");
                            arreglo[i] = entrada.nextInt();
                        }

                        for(i = 0; i < 10; i++){
                            if(arreglo[i] > 0){
                                sumaP += arreglo[i];
                                p++;
                            }else{
                                sumaN += arreglo[i];
                                n++;
                            }
                        }

                        if(p != 0){
                            System.out.println("Promedio de los valores positivos: "+sumaP/p);
                        }else{
                            System.out.println("No se han ingresado numeros positivos");
                        }

                        if(n != 0){
                            System.out.println("Promedio de los valores negativos: "+sumaN/n);
                        }else{
                            System.out.println("No se han ingresado valores negativos");
                        }

                        System.out.println("Desea regresar al menu?");
                        if(entrada.next().equals("si")) repetir = true;
                        else repetir = false;
                    }while(!repetir);
                break;

                case 2:
                    do{
                        int arreglo[] = new int[10];
                        System.out.println("Ingresa los numeros deseados");
                        for(i = 0; i < 10; i++){
                            System.out.print("numeros ["+ i +"]= ");
                            arreglo[i] = entrada.nextInt();
                        }

                        for(i = 0; i < 10; i++){
                            if(i % 2 == 0){
                                promedio = promedio + arreglo[i];
                            }
                        }
                        System.out.println("El promedio de los valores que se encuentran en las posiciones pares es: "+promedio/5);
                        
                        System.out.println("Desea regresar al menu?");
                        if(entrada.next().equals("si")) repetir = true;
                        else repetir = false;
                    }while(!repetir);        
                break;

                case 3:
                    do{
                    do {
                        System.out.print("Numero de alumnos de la clase: ");
                        numAlum = entrada.nextInt();
                    } while (numAlum <= 0);
        
                    double[] notas = new double[numAlum]; 
                
                    for (i = 0; i < notas.length; i++) {
                        System.out.print("Alumno " + (i + 1) + " Nota final: ");
                        notas[i] = entrada.nextDouble();
                    }
        
                    for (i = 0; i < notas.length; i++) {
                        suma = suma + notas[i];
                    }
        
                    media = suma / notas.length;
    
                    System.out.printf("Nota promedio del curso: %.2f %n", media);
        
                    System.out.println("Listado de notas superiores al promedio: ");
                    for (i = 0; i < notas.length; i++) {
                        if (notas[i] > media) {
                            System.out.println("Alumno numero " + (i + 1)+ " Nota final: " + notas[i]);
                        }
                    }
                    System.out.println("Desea regresar al menu?");
                        if(entrada.next().equals("si")) repetir = true;
                        else repetir = false;
                    }while(!repetir);
                break;

                case 4:
                    do{
                        int matriza[][] = new int[3][3]; 
                        int matrizb[][] = new int[3][3];
                        int matrizc[][] = new int[3][3];
                        System.out.println("Datos de la Matriz A :");
         
                        for (i=0; i<=2; i++){
                            for (j=0; j<=2; j++){
                                System.out.print("Escribir valor " + i + " , " + j + " : ");
                                matriza [i][j]= entrada.nextInt();
                               }
                        }
                       
                        System.out.println("Datos de la Matriz B :");
                       
                        for (i=0; i<=2; i++){
                            for (j=0; j<=2; j++){
                                System.out.print("Escribir valor " + i + " , " + j + " : ");
                                matrizb [i][j]= entrada.nextInt();
                               }
                            }
                       
                        for (i=0; i<=2; i++){
                            for (j=0; j<=2; j++){
                            matrizc [i][j]= matriza[i][j]+matrizb[i][j];
                           }
                        }
                       
                        System.out.println("Matriz resultante de la suma :");
                        for (i=0;i<=2;i++){
                            for (j=0;j<=2;j++) {
                           System.out.print(matrizc[i][j] + " ");
                        }
                       System.out.println("");   
                        }

                        System.out.println("Desea regresar al menu?");
                        if(entrada.next().equals("si")) repetir = true;
                        else repetir = false;
                    }while(!repetir);
                break;
            }


            System.out.println("Desea salir del menu?");
            if(entrada.next().equals("si")) salir = true;
            else salir = false;
       }while(!salir);
       System.out.println("._.");
    }    
}