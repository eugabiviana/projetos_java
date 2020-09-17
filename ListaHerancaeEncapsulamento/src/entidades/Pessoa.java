package entidades;

public class Pessoa 
{
	/*1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos
	 * seletores (getters) e modificadores (setters), e ainda o construtor padr�o e pelo
	 * menos mais duas op��es de construtores conforme sua percep��o. Atributos: String
	 * nome; String endere�o; String telefone; 
	 */
	
	private String nome;
	private String endere�o;
	private String telefone;
	private int anoNasc;
	private char sexo;
	
	public Pessoa()
	{
		
	}
	public Pessoa(String nome) 
	{
		super();
		this.nome = nome;
	}
	
	public Pessoa(String nome, String endere�o) 
	{
		super();
		this.nome = nome;
		this.endere�o = endere�o;
	}
	
	public Pessoa(String nome, String endere�o, String telefone) 
	{
		super();
		this.nome = nome;
		this.endere�o = endere�o;
		this.telefone = telefone;
	}
	
	public Pessoa(String nome, String endere�o, String telefone, int anoNasc) 
	{
		super();
		this.nome = nome;
		this.endere�o = endere�o;
		this.telefone = telefone;
		this.anoNasc = anoNasc;
	}

	public Pessoa(String nome, String endere�o, String telefone, int anoNasc, char sexo)
	{
		super();
		this.nome = nome;
		this.endere�o = endere�o;
		this.telefone = telefone;
		this.anoNasc = anoNasc;
		this.sexo = sexo;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getEndere�o()
	{
		return endere�o;
	}

	public void setEndere�o(String endere�o) 
	{
		this.endere�o = endere�o;
	}

	public String getTelefone() 
	{
		return telefone;
	}

	public void setTelefone(String telefone) 
	{
		this.telefone = telefone;
	}

	public int getAnoNasc() 
	{
		return anoNasc;
	}

	public void setAnoNasc(int anoNasc) 
	{
		this.anoNasc = anoNasc;
	}

	public char getSexo() 
	{
		return sexo;
	}

	public void setSexo(char sexo) 
	{
		this.sexo = sexo;
	}
	
}
