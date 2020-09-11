package Lista7;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*Crie um programa que leia um número do teclado até que encontre um 
		 *número igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)
		 */

		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		
		 int numero=0, somaNumeros=0;

	       do 
	       {
	           System.out.println("digite um numero");
	           numero=kb.nextInt();
	           somaNumeros=somaNumeros+numero;

	       }while(numero!=0);

	        System.out.printf("\na soma de todos os numeros é igual a: %d ",somaNumeros);
		
		kb.close();
	}

}
