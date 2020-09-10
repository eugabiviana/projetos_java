package Lista6;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*Faça um programa que receba três inteiros e diga qual deles é o maior.
		 */
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		
		int a, b, c, maiorNumero=0;
		
		System.out.println("Escreva o primeiro número inteiro A: ");
		a=kb.nextInt();
		System.out.println("Escreva o segundo número inteiro B: ");
		b=kb.nextInt();
		System.out.println("Escreva o terceiro número inteiro C: ");
		c=kb.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("O maior número inteiro é "+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("O maior número inteiro é "+b);
		}
		else 
		{
			System.out.println("O maior número inteiro é "+c);
		}
				
			
		
		
		kb.close();
	}

}
