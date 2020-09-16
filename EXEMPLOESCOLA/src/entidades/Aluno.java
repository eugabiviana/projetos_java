package entidades;

public class Aluno 
{
	// primeiro passo - atributos da classe
	
	public String nomeAluno;
	public int anoNascimentoAluno;
	public char sexoAluno;
	public char turmaAluno;
	public double notas[] = new double[4];
	public double mediaAluno;
	public double mediaEscola;
	
	//m�todos
	
	public void mostra() // void - nao volta, s� exibe. return - volta algo.
	{
		if(sexoAluno=='M')
		{
			System.out.printf("O nome do aluno � %s do sexo %s.",nomeAluno,sexoAluno);
		}
		else if (sexoAluno == 'F')
		{
			System.out.printf("O nome do aluna � %s do sexo %s.",nomeAluno,sexoAluno);
		}
			
	
	}
	public void mostraIdade(int anoNascimentoAluno) //n�o � um atributo! � par�metro.
	{
		System.out.printf("\nA idade do aluno � %d : ", (2020 - anoNascimentoAluno));
		this.anoNascimentoAluno = anoNascimentoAluno;
	}
	public void mostraMedia()
	{
		mediaAluno=((notas[0]+notas[1]+notas[2]+notas[3])/4);
		
		if(mediaAluno>=mediaEscola)
		{
			System.out.printf("Aprovado com m�dia %.2f",mediaAluno);
		}
		else
			System.out.printf("Reprovado com m�dia %.2f",mediaAluno);
		
		this.mediaEscola = mediaAluno;
	}
	
	
	//retorna valor
	//m�dia - retorna para o programa o valor da m�dia
	
	//escreve na tela - qual a media atual da escola
	// escreva aprovado ou reprovado (m�dia ultilizada - valor da m�dia)
	
	
}
