package Entidades;

public class Disciplina {

	String nomeDisciplina;
	int nivelDisciplina;
	
	public Disciplina(String nomeDisciplina)
	{
		this.nomeDisciplina = nomeDisciplina;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public int getNivelDisciplina() {
		return nivelDisciplina;
	}

	public void setNivelDisciplina(int nivelDisciplina) {
		this.nivelDisciplina = nivelDisciplina;
	}
	
}
