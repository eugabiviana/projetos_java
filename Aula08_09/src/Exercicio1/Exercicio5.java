package Exercicio1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final
		 * deste aluno. Considerar que a m�dia � ponderada e que o peso das notas �:
		 * 2,3 e 5, respectivamente. 
		 */

		int n1, n2, n3, mediaP;
		Scanner kb = new Scanner (System.in);
		
		System.out.println("Escreva a primeira nota: ");
		n1=kb.nextInt();
		System.out.println("Escreva a segunda nota: ");
		n2=kb.nextInt();
		System.out.println("Escreva a terceira nota: ");
		n3=kb.nextInt();
		
		mediaP=(((n1*2)+(n2*3)+(n3*5))/10);
				
				System.out.println("A m�dia final do aluno �: "+mediaP);
	}

}
