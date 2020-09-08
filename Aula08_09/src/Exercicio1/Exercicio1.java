package Exercicio1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos,
		 * meses e dias e mostre-a expressa apenas em dias. 
		 */
		int anos, meses, dias, idadeDias;
		Scanner kb= new Scanner(System.in);
		
		System.out.println("Digite a sua idade em anos: ");
		anos=kb.nextInt();
		System.out.println("Digite a sua idade em meses: ");
		meses=kb.nextInt();
		System.out.println("Digite a sua idade em dias: ");
		dias=kb.nextInt();
		
		anos=(anos*365);
		meses=(meses*30);
		dias=dias;
		idadeDias=(dias+anos+meses);
		
		System.out.println("A idade em dias é igual a: "+idadeDias+" dias.");

	}

}
