package Exercicio3ProdutoEletronico;

import java.util.Locale;
import java.util.Scanner;

public class ProdutoEletronicoMain {

	public static void main(String[] args) {
		/*3) Crie uma classe produto eletr�nico e apresente os atributos e
		 * m�todos referentes esta classe, em seguida crie um objeto produto eletr�nico,
		 * defina as instancias deste objeto e apresente as informa��es deste objeto no
		 * console.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		ProdutoEletronico produto1 = new ProdutoEletronico();
		

		System.out.println("Digite o tipo de aparelho eletr�nico: ");
		produto1.tipo= kb.next();
		System.out.println("Digite a marca do aparelho eletr�nico: ");
		produto1.marca= kb.next();
		System.out.println("Digite o modelo do aparelho eletr�nico: ");
		produto1.modelo= kb.next();
		
		//m�todo
		produto1.mostraTipo();
		produto1.mostraMarca();
		produto1.mostraModelo();
		
		
		kb.close();
	}

}
