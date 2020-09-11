package Lista7;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*Escrever um programa que receba vários números inteiros no teclado.
		 * E no final imprimir a média dos números múltiplos de 3.
		 * Para sair digitar 0(zero).(DO...WHILE)
		 */
		
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		
		 double numero=0, soma=0, media=0, cont=0;
		 
     do
     {
         System.out.println("Digite um numero inteiro: ");
         numero=kb.nextInt();

         if (numero%3==0)
         {     	
        	 soma=soma+numero;
        	 cont=cont+1;    
         }
         
     }while (numero!=0);
        
     	media=soma/(cont-1);
     
         System.out.printf("A media dos números múltiplos de 3 é: %.2f", media);

		
		kb.close();
	}

}
