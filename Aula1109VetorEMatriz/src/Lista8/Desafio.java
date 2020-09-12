package Lista8;

import java.util.Locale;
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		
		int TAMANHO=3;
		int matriz[][]= new int [TAMANHO][TAMANHO];
		int soma=0, somaDiagonal=0;
		
		for (int linha=0;linha<TAMANHO;linha++)
		{
			for(int coluna=0;coluna<TAMANHO;coluna++)
			{
				System.out.println("Digite o número: ");
				matriz[linha][coluna] = kb.nextInt();
				
				soma+=matriz[linha][coluna];
				if(linha==coluna)
				{
					somaDiagonal+=matriz[linha][coluna];
				}
			}
			
		
		}
	
		System.out.printf("A soma total da matriz é %d.", soma);
		System.out.printf("A soma da diagonal matriz é %d.", somaDiagonal); 
		
		kb.close();
	}

}
