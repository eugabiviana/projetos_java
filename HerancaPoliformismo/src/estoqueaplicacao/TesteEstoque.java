package estoqueaplicacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class TesteEstoque {

	public static void main(String[] args) {
		
		
		//creating the list
		Collection <String> estoque = new ArrayList();
		estoque.add("Arroz");
		estoque.add("Feijão");
		estoque.add("Farofa");
		estoque.add("Macarrão");
		System.out.println("Lista:");
		System.out.println(estoque);
		
		//removing items from the list
		System.out.println("");
		System.out.println("Removendo ítem da lista:");
		estoque.remove("Macarrão");
		System.out.println(estoque);
		
		// updating the list
		Collection <String> estoque2 = Arrays.asList("Carne","Frango","Coração");
		estoque.addAll(estoque2);
		System.out.println("");
		System.out.println("Adicionando ítens à lista:");
		System.out.println(estoque);
		
		
	}

}
