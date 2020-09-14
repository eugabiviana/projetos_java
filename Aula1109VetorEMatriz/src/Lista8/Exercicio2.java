package Lista8;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*2- Faça um programa que receba 6 números inteiros e mostre: 
		• Os números pares digitados;  
		• A soma dos números pares digitados; 
		• Os números ímpares digitados; 
		• A quantidade de números ímpares digitados.
		 */

		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner (System.in);
		Random sorteio = new Random();
		List<Integer> numerosImpares = new ArrayList();
		List<Integer> numerosPares = new ArrayList();
		
        final int LIMITE=6;
        int[] vetor = new int [6];
        int y=0, somaPares=0, contImpares=0;
        int numeroSorteado=0;

        for(y=0;y<LIMITE;y++)
        {
            numeroSorteado=sorteio.nextInt(20)+1;
            System.out.print(" "+numeroSorteado);

            if(numeroSorteado % 2 == 0)
            {
            	numerosPares.add(numeroSorteado);
            	somaPares=somaPares+numeroSorteado;
            }
            else if(numeroSorteado % 2 != 0)
            {
            	numerosImpares.add(numeroSorteado);
            	contImpares++;
            }
            
        }
        
         	
        System.out.println("\n");
        System.out.println("Os numeros pares digitados são: "+numerosPares);
        System.out.print("A soma dos numeros pares é igual a: "+somaPares);
        System.out.print("\n");
        System.out.println("Os números ímpares digitados são: "+numerosImpares);
        System.out.print("A quantidade de numeros ímpares é de: "+contImpares);
				
        
		kb.close();		
	}

}
