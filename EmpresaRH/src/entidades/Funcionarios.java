package entidades;

public class Funcionarios 
{
	
	private String nome;
	private int horasTrabalhadas;
	private double valorPorHora, pagamento;
	
	public double pagamento()
	{
		pagamento=valorPorHora*horasTrabalhadas;
		return pagamento;
	}
	
	
	
	public Funcionarios(String nome) {
		super();
		this.nome = nome;
	}

	public Funcionarios(String nome, int horasTrabalhadas) {
		super();
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public Funcionarios(String nome, int horasTrabalhadas, double valorPorHora) {
		super();
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorPorHora = valorPorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
}
