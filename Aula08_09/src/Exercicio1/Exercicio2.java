package Exercicio1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e
		 * mostre-a expressa em anos, meses e dias. 
		 */

		int anos, meses, dias, idadeDias;
		Scanner kb= new Scanner(System.in);
		
		System.out.println("Digite a sua idade em dias: ");
		idadeDias=kb.nextInt();
		
		anos=(idadeDias/365);
		meses=((idadeDias%365)/30);
		dias=((idadeDias%365)%30);
		
		
		System.out.println("A idade em dias é igual a: "+anos+" anos,"+meses+" meses e "+dias+" dias.");
	}

}
