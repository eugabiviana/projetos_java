package Exercicio2Aviao;

import java.util.Locale;
import java.util.Scanner;

public class AviaoMain 
{

	public static void main(String[] args) 
	{
		/*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
		 * esta classe, em seguida crie um objeto avi�o, defina as instancias deste
		 * objeto e apresente as informa��es deste objeto no console.
		 */
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		Aviao aviao1 = new Aviao();

        System.out.println("PARAMETROS DO AVI�O");

        System.out.println("Qual o modelo do aviao ?");
        aviao1.modelo = kb.nextLine();
        System.out.println("O AVIAO ESTA LIGADO ?  1- sim  / 2- n�o ");
        aviao1.liga = kb.nextInt();

        aviao1.mostraliga();
        aviao1.mostraModelo();
		
		
		kb.close();
	}

}
