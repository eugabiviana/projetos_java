package Exercicio1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*4. Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C)
		 * e calcule a seguinte express�o: 
		 * D=R+S/2, onde:
		 * R=(A+B)^2
		 * S=(B+C)^2
		 */
		
		double A, B, C, D, R, S;
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Digite o n�mero A: ");
		A=kb.nextInt();
		System.out.println("Digite o n�mero B: ");
		B=kb.nextInt();
		System.out.println("Digite o n�mero C: ");
		C=kb.nextInt();
		
		R=(Math.pow(A+B,2));
		S=(Math.pow(B+C,2));
		D=((R+S)/2);
		
		System.out.println("O valor de D �: "+D);
	}

}
