package enquantoMultplicacaoPor3;

import java.util.Scanner;


public class enquantoMultplicacaoPor3 {

	public static void main(String[] args) {
		/*Obtenha um n�mero digitado pelo usu�rio e repita a opera��o de multiplicar
		 * ele por tr�s  (imprimindo o novo valor) at� que ele seja maior do que 100.
		 * Ex.: se o usu�rio digita 5,  deveremos observar na tela a seguinte sequ�ncia:
		 * 5 15 45 135.
		 */
		
		Scanner teclado= new Scanner(System.in); 		
		System.out.println("Digite um n�mero: ");
		int num=teclado.nextInt();
				
		while(num<=100)
		{
			System.out.println("O valor do n�mero multiplicado por 3 �: "+num);
			num=(num*3);
			
		}
		System.out.println("O primeiro n�mero ap�s 100 ser�: "+num);
	}

}
