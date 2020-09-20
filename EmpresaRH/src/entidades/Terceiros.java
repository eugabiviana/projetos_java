package entidades;

public class Terceiros extends Funcionarios
{
private double horasAdicionais;

	
	public double pagamento()
	{
		pagamento=(valorPorHora*horasTrabalhadas)+(horasAdicionais*valorPorHora);
		return pagamento;
	}
	
	
	public Terceiros(String nome, double horasAdicionais) {
		super(nome);
		this.horasAdicionais = horasAdicionais;
	}

	public double getHorasAdicionais() {
		return horasAdicionais;
	}

	public void setHorasAdicionais(double horasAdicionais) {
		this.horasAdicionais = horasAdicionais;
	}
}
