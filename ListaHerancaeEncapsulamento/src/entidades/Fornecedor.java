package entidades;

public class Fornecedor extends Pessoa
{
	/*2. Considere, como subclasse da classe Pessoa (desenvolvida no exercício anterior)
	 * a classe Fornecedor. Considere que cada instância da classe Fornecedor tem, para
	 * além dos atributos que caracterizam a classe Pessoa, os atributos valorCredito
	 * (correspondente ao crédito máximo atribuído ao fornecedor) e valorDivida (montante
	 * da dívida para com o fornecedor). Implemente na classe Fornecedor, para além dos
	 * usuais métodos seletores e modificadores, um método obterSaldo() que devolve a
	 * diferença entre os valores dos atributos valorCredito e valorDivida. Depois de
	 * implementada a classe Fornecedor, crie um programa de teste adequado que lhe
	 * permita verificar o funcionamento dos métodos implementados na classe Fornecedor
	 * e os herdados da classe Pessoa. 
	 */
	
	private double valorCredito;
	private double valorDivida;
	private double obterSaldo;
		
	public Fornecedor(String nome, String endereço, String telefone, double valorCredito, double valorDivida, double obterSaldo) 
	{
		super(nome, endereço, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
		this.obterSaldo = obterSaldo;
	}
	
	//metodo
	
	
	public void obterSaldo()
	{
		obterSaldo = (valorCredito-valorDivida);
        System.out.println("O valor do saldo é: R$"+obterSaldo);		
		/*if(valorCredito>valorDivida)
		{
			obterSaldo=(valorCredito-valorDivida);
			System.out.println(obterSaldo);
		}
		else if (valorDivida>valorCredito)
		{
			obterSaldo = (valorDivida-valorCredito);
			System.out.println(obterSaldo);
		}*/
	}
	
	public Fornecedor()
	{
		
	}
	
	public Fornecedor(double valorCredito, double valorDivida, double obterSaldo) 
	{
		super();
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
		this.obterSaldo = obterSaldo;
	}

	public double getObterSaldo() {
		return obterSaldo;
	}

	public void setObterSaldo(double obterSaldo) {
		this.obterSaldo = obterSaldo;
	}

	public double getValorCredito()
	{
		return valorCredito;
	}
	public void setValorCredito(double valorCredito)
	{
		this.valorCredito = valorCredito;
	}
	public double getValorDivida()
	{
		return valorDivida;
	}
	public void setValorDivida(double valorDivida)
	{
		this.valorDivida = valorDivida;
	}
		
}
