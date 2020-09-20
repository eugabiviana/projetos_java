package estoqueaplicacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class TesteEstoque {

	public static void main(String[] args) {
		
		
		//creating the list
		Collection <String> estoque = new ArrayList();
		estoque.add("Arroz");
		estoque.add("Feij�o");
		estoque.add("Farofa");
		estoque.add("Macarr�o");
		System.out.println("Lista:");
		System.out.println(estoque);
		
		//removing items from the list
		System.out.println("");
		System.out.println("Removendo �tem da lista:");
		estoque.remove("Macarr�o");
		System.out.println(estoque);
		
		// updating the list
		Collection <String> estoque2 = Arrays.asList("Carne","Frango","Cora��o");
		estoque.addAll(estoque2);
		System.out.println("");
		System.out.println("Adicionando �tens � lista:");
		System.out.println(estoque);
		
		
	}

}
