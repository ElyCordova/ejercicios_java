//* Algoritmo para calcular el volumen de una esfera teniedno el dato del radio por consola*//
//* Volumen= (4 * pi * (radio ^ 3)) / 3

import java.util.Scanner;
public class volumenEsfera {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        //*Declaracion de variables:
        double radio, volumen;

        System.out.println("Ingresa el radio de la esfera en centímetros: ");
        radio= sc.nextDouble();

        //*Bloque del cálculo*//
        volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);

        System.out.println("El volumen de la esfera es: "+ volumen + " centimetros");
    }
}
