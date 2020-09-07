package enquantoMultplicacaoPor3;

import java.util.Scanner;


public class enquantoMultplicacaoPor3 {

	public static void main(String[] args) {
		/*Obtenha um número digitado pelo usuário e repita a operação de multiplicar
		 * ele por três  (imprimindo o novo valor) até que ele seja maior do que 100.
		 * Ex.: se o usuário digita 5,  deveremos observar na tela a seguinte sequência:
		 * 5 15 45 135.
		 */
		
		Scanner teclado= new Scanner(System.in); 		
		System.out.println("Digite um número: ");
		int num=teclado.nextInt();
				
		while(num<=100)
		{
			System.out.println("O valor do número multiplicado por 3 é: "+num);
			num=(num*3);
			
		}
		System.out.println("O primeiro número após 100 será: "+num);
	}

}
