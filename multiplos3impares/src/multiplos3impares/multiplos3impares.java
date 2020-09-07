package multiplos3impares;

public class multiplos3impares {

	public static void main(String[] args) {
		int num, soma=0;
		
		for(num=1;num<500;num++)
		{
			if(num%3==0)
			{
				if(num%2!=0)
				{
					System.out.println(num);
					soma=(soma+num);
				}
			}
		}
			System.out.println("+----------------------------------------------------+");
			System.out.println("A soma de todos os múltiplos de 3 e ímpares é: "+soma);
			
				
	}
}
