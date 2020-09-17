package Entidades;

public class Aluno extends Pessoa
{

	private String turma;
	private int notas[] = new int[2];
	
	public Aluno(String nome, char sexo, int anoNasc, String etnia, String turma) 
	{
		super(nome, sexo, anoNasc, etnia);
		this.turma = turma;
		
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}
	
}
