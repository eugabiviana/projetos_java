package Exercicio3ProdutoEletronico;

public class ProdutoEletronico {

	public String tipo;
	public String marca;
	public String modelo;
	
	public void mostraTipo()
	{
		System.out.printf("\nO aparelho eletr�nico � um: %s, ",tipo);
	}
	
	public void mostraMarca()
	{
		System.out.printf("da marca %s e ",marca);
	}

	public void mostraModelo()
	{
		System.out.printf("modelo %s.",modelo);
	}
		
}
