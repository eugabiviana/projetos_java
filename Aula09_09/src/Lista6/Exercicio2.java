package Lista6;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.

		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		
		
			int num1, num2, num3, aux;
			System.out.print("Digite o 1� n�mero: ");
			num1 = kb.nextInt();
			System.out.print("Digite o 2� n�mero: ");
			num2 = kb.nextInt();
			System.out.print("Digite o 3� n�mero: ");
			num3 = kb.nextInt();
			if(num1 > num2) {
				aux = num1;
				num1 = num2;
				num2 = aux;
			} 
			if(num1 > num3) {
				aux = num1;
				num1 = num3;
				num3 = aux;
			}
			if(num2 > num3) {
				aux = num2;
				num2 = num3;
				num3 = aux;
			} 
			
			System.out.printf("N�mero 1: %d - N�mero 2: %d - N�mero 3: %d", num1, num2, num3);
			
		kb.close();
	}

}
