package Exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		
		double a, b, c, d, E, f, x, y;
		
		System.out.println("Escreva o primeiro número: ");
		a=kb.nextDouble();
		System.out.println("Escreva o segundo número: ");
		b=kb.nextDouble();
		System.out.println("Escreva o terceiro número: ");
		c=kb.nextDouble();
		System.out.println("Escreva o quarto número: ");
		d=kb.nextDouble();
		System.out.println("Escreva o quinto número: ");
		E=kb.nextDouble();
		System.out.println("Escreva o sexto número: ");
		f=kb.nextDouble();
		
		x= ((c*E)-(b*f)/(a*E)-(b*d));
		y= ((a*f)-(c*d)/(a*E)-(b*d));
		c= ((a*x)+(b*y));
		f= ((d*x)+(E*y));
		
		System.out.printf("\nOs valores de x e y são, respectivamente, "+x+" e "+y+ "."); 

		
		kb.close();
	}

}
