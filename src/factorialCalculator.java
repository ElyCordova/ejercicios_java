//*Calculo del factorial de un nuemro dado usando el metodo de RECURSIVIDAD y los ciclos IF... ELSE and WHILE*//

import java.util.Scanner;
public class factorialCalculator {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");

        int numero = sc.nextInt();

        //* bloque declaración de variables*//
        int i = numero;
        //*0! = 1;*//
        long factorial = 1;

        //*ciclo if...else*//
        if (i < 0) {
           System.out.println("El numero es negativo y no se puede calcular su factorial");
        } else {
            while (i > 0) {
                factorial = factorial * i ;
                i = i - 1 ;
            }
            System.out.println("El factorial del numero " + numero + " es: " + factorial);
        }
    }
}
