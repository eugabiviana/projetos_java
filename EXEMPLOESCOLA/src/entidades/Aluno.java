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
	
	//métodos
	
	public void mostra() // void - nao volta, só exibe. return - volta algo.
	{
		if(sexoAluno=='M')
		{
			System.out.printf("O nome do aluno é %s do sexo %s.",nomeAluno,sexoAluno);
		}
		else if (sexoAluno == 'F')
		{
			System.out.printf("O nome do aluna é %s do sexo %s.",nomeAluno,sexoAluno);
		}
			
	
	}
	public void mostraIdade(int anoNascimentoAluno) //não é um atributo! é parâmetro.
	{
		System.out.printf("\nA idade do aluno é %d : ", (2020 - anoNascimentoAluno));
		this.anoNascimentoAluno = anoNascimentoAluno;
	}
	public void mostraMedia()
	{
		mediaAluno=((notas[0]+notas[1]+notas[2]+notas[3])/4);
		
		if(mediaAluno>=mediaEscola)
		{
			System.out.printf("Aprovado com média %.2f",mediaAluno);
		}
		else
			System.out.printf("Reprovado com média %.2f",mediaAluno);
		
		this.mediaEscola = mediaAluno;
	}
	
	
	//retorna valor
	//média - retorna para o programa o valor da média
	
	//escreve na tela - qual a media atual da escola
	// escreva aprovado ou reprovado (média ultilizada - valor da média)
	
	
}
