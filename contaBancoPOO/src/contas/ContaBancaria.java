package contas;

	public abstract class ContaBancaria {
		
		private int numero;
		private double saldo;
		
		private String transacoes[]= new String [3];
		
		//metodos
		public void emiteExtrato() {
			
		}
		public double credite() {
			return 0;
		}
		public double debite() {
			return 0;
		}
		
		//get and set
		public int getNumero() {
			return numero;
		}
		public void setNumero(int numero) {
			this.numero = numero;
		}
		public double getSaldo() {
			return saldo;
		}
		
		public String[] getTransacoes() {
			return transacoes;
		}
		public void setTransacoes(String[] transacoes) {
			this.transacoes = transacoes;
		}
		
	}
}
