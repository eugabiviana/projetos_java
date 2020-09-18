package aplicacao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import entidades.Funcionarios;
import entidades.Terceiros;

public class Principal 
{

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		
		//// Digite o numero de funcionarios para cadastro:
		// quantos funcionarios ?? 1,2,3   <----- ArrayList - tipo funcionario
		// cada funcionario é um objeto
		// lance os dados por objeto
		// pedi o nome --> nome
		//pedi horas
		// valor por hora
		// e os terceiros??? tem quer pra terceiro
		// horas adicionais
				
		// INTERFACE -- List // ArrayList
		
		// mostra nome - salario do funcionario
		
		Set<Funcionarios> funcionarios = new HashSet<Funcionarios>();
		Funcionarios func01 = new Funcionarios("João");
		Funcionarios func02 = new Funcionarios("Maria");
		funcionarios.add(func01);
		funcionarios.add(func02);
		
	}

}
