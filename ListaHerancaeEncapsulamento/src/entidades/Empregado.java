package entidades;

public class Empregado extends Pessoa
{

	/*3. Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada inst�ncia da classe Empregado tem, para al�m dos atributos que caracterizam a classe Pessoa, os atributos codigoSetor (inteiro), salarioBase (vencimento base) e imposto (porcentagem retida dos impostos). Implemente a classe Empregado com m�todos seletores e modificadores e um m�todo calcularSalario. Escreva um programa de teste adequado para a classe Empregado. 
	 */
	
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	private double calcularSalario;
	
	
	public Empregado(String nome, String endere�o, String telefone, int codigoSetor, double salarioBase, double imposto,	double calcularSalario) {
		super(nome, endere�o, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
		this.calcularSalario = calcularSalario;
	}

	//metodo
	
	public void calcularSalario()
	{
		calcularSalario=(salarioBase-(salarioBase*imposto));
		System.out.println("O sal�rio do funcion�rio �: R$"+calcularSalario);
	}
	
	public Empregado()
	{
		
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public double getCalcularSalario() {
		return calcularSalario;
	}

	public void setCalcularSalario(double calcularSalario) {
		this.calcularSalario = calcularSalario;
	}
	
}
