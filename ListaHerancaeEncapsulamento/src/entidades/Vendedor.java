package entidades;

public class Vendedor {

	private double valorVendas;
	private double comissao;
	
	// constructor
	public Vendedor(double valorVendas, double comissao) {
		super();
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}

	// get and set
	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	
}
