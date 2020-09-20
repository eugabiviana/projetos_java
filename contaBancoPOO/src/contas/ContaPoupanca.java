package contas;

public class ContaPoupanca extends ContaBancaria {

		private double juros;
		private double corrMonetaria;
		private int mesAniversario;
		
		//metodos
		public void aniversarioMes() {

		}
		
		//get and set
		public double getJuros() {
			return juros;
		}

		public void setJuros(double juros) {
			this.juros = juros;
		}

		public double getCorrMonetaria() {
			return corrMonetaria;
		}

		public void setCorrMonetaria(double corrMonetaria) {
			this.corrMonetaria = corrMonetaria;
		}

		public int getMesAniversario() {
			return mesAniversario;
		}

		public void setMesAniversario(int mesAniversario) {
			this.mesAniversario = mesAniversario;
		}
		
}
