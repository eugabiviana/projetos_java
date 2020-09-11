package Lista7;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos indiv�duos
		 * de uma regi�o. Para tanto, a cada uma das pessoas era perguntado: idade, sexo 
		 * (1-feminino / 2-masculino), e as op��es (1, se a pessoa era calma; 2, se a pessoa era nervosa
		 * e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema que permita ler os dados de
		 * 150 pessoas, calcule e mostre: (WHILE)
			
			o n�mero de pessoas calmas; **
			o n�mero de mulheres nervosas; **
			o n�mero de homens agressivos; **
			o n�mero de pessoas nervosas com mais de 40 anos; **
			o n�mero de pessoas calmas com menos de 18 anos. **
		 */
		
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		
		int pessoas=0, idade=0, sexo=0, temperamento=0;
		int pessoasCalmas18=0, pessoasCalmas=0, homensAgressivos=0, mulheresNervosas=0, pessoasNervosas40=0;
		final int LIMITE=4; // final � igual a constante do Portugol = const
		
		System.out.println("-----Pesquisa de comportamento-----");
		
		while(pessoas<=LIMITE)
		{
			System.out.println("Escreva a sua idade: ");
			idade=kb.nextInt();
			System.out.println("Digite 1 para Feminino e 2 para Masculino: ");
			sexo=kb.nextInt();
			System.out.println("Digite 1 para Calma, 2 para Nervoso e 3 para Agressivo: ");
			temperamento=kb.nextInt();
			
			if (sexo==1 && temperamento==2) //if = se; && = e; 1 mulheres e 2 - nervosas
			{
				mulheresNervosas=mulheresNervosas+1; // isso � igual a mulheresNervosas++
			}
			else if (sexo==2 && temperamento==3) // else if = senao se | 2- homens e 3 - agressivos
			{
				homensAgressivos=homensAgressivos+1;
			}
			else if (idade>40 && temperamento==2)
			{
				pessoasNervosas40=pessoasNervosas40+1;
			}
			else if (idade<18 && temperamento==1)
			{
				pessoasCalmas18=pessoasCalmas18+1;
			}
			else if (temperamento==1)
			{
				pessoasCalmas=pessoasCalmas+1;
			}
			
			pessoas++;
			
		}
		System.out.printf("\nO n�mero de pessoas que se declararam calmas � de: %d",pessoasCalmas);
		System.out.printf("\nO n�mero de mulheres que se declararam calmas � de: %d",mulheresNervosas);
		System.out.printf("\nO n�mero de homens que se declararam agressivos � de: %d",homensAgressivos);
		System.out.printf("\nO n�mero de pessoas calmas com mais de 40 nos � de: %d",pessoasNervosas40);
		System.out.printf("\nO n�mero de pessoas calmas menores de 18 anos � de: %d",pessoasCalmas18);
		
		
		kb.close();
	}

}
