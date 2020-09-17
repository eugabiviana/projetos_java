package aplicacao;

import java.util.Scanner;

import entidades.Empregado;
import entidades.Fornecedor;

public class ProgramaTeste {

	public static void main(String[] args) 
	{
		// Teste do programa
		
		Scanner kb = new Scanner(System.in);
		Fornecedor fornecedor1 = new Fornecedor();
		Empregado empregado1 = new Empregado();
		
		System.out.println("Digite o valor do crédito: ");
		fornecedor1.setValorCredito(kb.nextDouble());
		System.out.println("Digite o valor da dívida: ");
		fornecedor1.setValorDivida(kb.nextDouble());
		System.out.println("Digite o valor do salário base: ");
		empregado1.setSalarioBase(kb.nextDouble());
		System.out.println("Digite o valor do imposto: ");
		empregado1.setImposto(kb.nextDouble());		
		
		//System.out.printf(fornecedor1.obterSaldo());
		fornecedor1.obterSaldo();
		empregado1.calcularSalario();
	}

}
