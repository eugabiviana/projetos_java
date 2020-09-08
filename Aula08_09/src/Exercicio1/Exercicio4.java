package Exercicio1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*4. Escreva  um sistema que leia três números inteiros e positivos (A, B, C)
		 * e calcule a seguinte expressão: 
		 * D=R+S/2, onde:
		 * R=(A+B)^2
		 * S=(B+C)^2
		 */
		
		double A, B, C, D, R, S;
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Digite o número A: ");
		A=kb.nextInt();
		System.out.println("Digite o número B: ");
		B=kb.nextInt();
		System.out.println("Digite o número C: ");
		C=kb.nextInt();
		
		R=(Math.pow(A+B,2));
		S=(Math.pow(B+C,2));
		D=((R+S)/2);
		
		System.out.println("O valor de D é: "+D);
	}

}
