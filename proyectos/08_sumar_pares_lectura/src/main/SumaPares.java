package main;

import java.util.Scanner;

public class SumaPares {
	//dados dos números cualquiera, hacer una programa
	//que muestre la suma de todos los números pares
	//comprendidos entre ambos
	void main() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Introduce un número: ");
        int a=scan.nextInt();
        System.out.println("Introduce otro número: ");
        int b=scan.nextInt();
        int suma=0;
 
        int min, max;
        /*if (a < b) {
            min = a;
            max = b;
        } else {
            min = b;
            max = a;
        }*/
        min=a>b?b:a;
        max=a>b?a:b;
 
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        System.out.println("La suma de los números pares entre " + min + " y " + max + " es: " + suma);
 
    }
}
