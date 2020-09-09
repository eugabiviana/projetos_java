package Exercicio1;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*6. Construa um programa em c que, tendo como dados de entrada dois pontos
		 * quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles.
		 * A fórmula que efetua tal cálculo é: 
		 * d=raiz quadrada(x2+x1)^2 + (y2-y1)^2
		 */

		double x1,x2,y1,y2,d;
		Scanner kb = new Scanner (System.in);
		
		System.out.println("Escrava a distâcia x1: ");
		x1=kb.nextInt();
		System.out.println("Escrava a distâcia y1: ");
		y1=kb.nextInt();
		System.out.println("Escrava a distâcia x2: ");
		x2=kb.nextInt();		
		System.out.println("Escrava a distâcia y2: ");
		y2=kb.nextInt();
		
		d=(Math.sqrt(Math.pow((x1+x2),2) + (Math.pow((y2-y1), 2))));
		
		System.out.println("O valor da distância D é: "+d);
		 
		
		
	}

}
