package Lista6;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		 */
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		
		int a, b, c, maiorNumero=0;
		
		System.out.println("Escreva o primeiro n�mero inteiro A: ");
		a=kb.nextInt();
		System.out.println("Escreva o segundo n�mero inteiro B: ");
		b=kb.nextInt();
		System.out.println("Escreva o terceiro n�mero inteiro C: ");
		c=kb.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("O maior n�mero inteiro � "+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("O maior n�mero inteiro � "+b);
		}
		else 
		{
			System.out.println("O maior n�mero inteiro � "+c);
		}
				
			
		
		
		kb.close();
	}

}
