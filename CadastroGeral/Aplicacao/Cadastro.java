package Aplicacao;

import java.util.Scanner;
import Entidades.Aluno;
import Entidades.Pessoa;
import Entidades.Professor;

public class Cadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		Pessoa fulano = new Pessoa("JOSÉ");
		Pessoa ciclano = new Pessoa("MARIA",'F',1980);
		Aluno novoAluno = new Aluno("CARLOS", 'M',2000, "BRANCO","TURMA 8");
		Professor novoProfessor = new Professor ("LUIZA","MODULO II");
		
		
		System.out.println(novoAluno.getTurma());
		System.out.println(novoProfessor.getNome());
		
				
				
		kb.close();
	}

}
