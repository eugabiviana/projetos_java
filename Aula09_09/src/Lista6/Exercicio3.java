package Lista6;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) 
	{
		/*Faça um programa que receba a idade de uma pessoa e mostre na 
		 * saída em qual categoria ela se encontra:
·          	10-14 infantil
·           15-17 juvenil
·           18-25 adulto
		 */
		
		int idade;
		
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Digite a sua idade: ");
		idade=kb.nextInt();
		
		if(idade>=10 && idade<=14)
		{
			System.out.println("Categoria Infatil.");
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.println("Categoria Juvenil.");
		}
		else if(idade>=18 && idade<=25)
		{
			System.out.println("Categoria Adulto.");
		}
		else
			System.out.println("Não atendemos o seu perfil.");
		
		kb.close();
	}

}
