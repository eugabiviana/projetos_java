package entidades;

public class Administrador extends Pessoa {

	private double ajudaDeCusto;

	//constructors
	
	public Administrador(double ajudaDeCusto) {
		super();
		this.ajudaDeCusto = ajudaDeCusto;
	}

	//get and set
	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
}
