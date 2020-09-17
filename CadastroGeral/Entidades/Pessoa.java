package Entidades;

public class Pessoa 
{
	public String nome;
	public char sexo;
	public int anoNasc;
	public String etnia;
	
	
	public Pessoa (String nome)
	{
		this.nome=nome;
	}
	
		
	public Pessoa (String nome,int anoNasc)
	{
		this.nome=nome;
		this.anoNasc=anoNasc;
	}


	public Pessoa(String nome, char sexo, int anoNasc) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.anoNasc = anoNasc;
	}


	public Pessoa(String nome, char sexo, int anoNasc, String etnia) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.anoNasc = anoNasc;
		this.etnia = etnia;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	public int getAnoNasc() {
		return anoNasc;
	}


	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}


	public String getEtnia() {
		return etnia;
	}


	public void setEtnia(String etnia) {
		this.etnia = etnia;
	}

	
	

	
}
