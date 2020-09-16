package Aplicacao;

import java.util.Scanner;

import entidades.Aluno;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		Aluno alunoExemplo = new Aluno();
		
		int ano;
		
		System.out.println("SISTEMA DE CONTROLE ESCOLAR EM JAVA - POO");
		
		/*CRIEM CLASSE ALUNO - no pacote --> entidades
		*nomeAluno[texto];
		*anoNascimentoAluno[numero inteiro];
		*sexoAluno[caracter];
		*turmaAluno [caracter];
		*boa prática de package é escrever o nome todo minúsculo.
		*/
		
		System.out.println("Digite o seu nome: ");
		alunoExemplo.nomeAluno=kb.next().toUpperCase();
		System.out.println("Digite o seu gênero [F/M]: ");
		alunoExemplo.sexoAluno=kb.next().charAt(0);
		System.out.println("Digite as 4 notas: ");
		alunoExemplo.notas[0] = kb.nextDouble();
		alunoExemplo.notas[1] = kb.nextDouble();
		alunoExemplo.notas[2] = kb.nextDouble();
		alunoExemplo.notas[3] = kb.nextDouble();
		System.out.println("Digite o ano do seu nascimento: ");
		ano=kb.nextInt();
		System.out.println("Digite a média atual da escola: ");
		alunoExemplo.mediaEscola=kb.nextDouble();
		
		
		// método
		alunoExemplo.mostra();
		alunoExemplo.mostraIdade(ano);
		System.out.println("");
		System.out.println(alunoExemplo.anoNascimentoAluno);
		alunoExemplo.mostraMedia();
		
		
	}

}
