import java.util.*;

public class AreaYPerimetroFig{

    Scanner entrada = new Scanner(System.in);

    int radio, base, altura, lado, lado1, lado2, lado3;
    double resultado, resultado1;


    public void AyPC(){

    System.out.println("Ingrese el radio de su circulo");
    radio = entrada.nextInt();
    resultado = 3.14*(radio*radio);
    System.out.println("El area de su circulo es: "+resultado);
    resultado1 = 2*3.14*radio;
    System.out.println("El perimetro de su circulo es: "+resultado1);
    }

    public void AyPR(){

    System.out.println("Ingrese la base de su rectangulo");
    base = entrada.nextInt();
    System.out.println("Ingrese la altura de su rectangulo");
    altura = entrada.nextInt();
    resultado = base*altura;
    resultado1 = (base*2)+(altura*2);
    System.out.println("El area de su rectangulo es: "+resultado);
    System.out.println("El perimetro de su rectangulo es: "+resultado1);
    }

    public void AyPCu(){

        System.out.println("Ingrese un lado de su cuadrado");
        lado = entrada.nextInt();
        resultado = lado*lado;
        resultado1 = lado*4;
        System.out.println("El area de su cuadrado es: "+resultado);
        System.out.println("El perimetro de su cuadrado es: "+resultado1);
    }

    public void AyPT(){

        System.out.println("Ingrese el primer lado de su triangulo");
        lado1 = entrada.nextInt();
        System.out.println("Ingrese el segundo lado de su triangulo");
        lado2 = entrada.nextInt();
        System.out.println("Ingrese el tercer lado de su triangulo");
        lado3 = entrada.nextInt();
        System.out.println("Ingrese la base de su triangulo");
        base = entrada.nextInt();
        System.out.println("Ingrese la altura de su triangulo");
        altura = entrada.nextInt();
        resultado = (base*altura)/2;
        resultado1 = lado1+lado2+lado3;
        System.out.println("El area de su triangulo es: "+resultado);
        System.out.println("El perimetro de su triangulo es: "+resultado1);
    }
}    