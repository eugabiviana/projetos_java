package Lista8;

import java.util.Random;
import java.util.Scanner;

public class Exercicio2Opcao2 {

	public static void main(String[] args) {
		 /*  2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
        � Os n�meros pares digitados;              ooooooooooooooookkkkkkkkk
        � A soma dos n�meros pares digitados; 
        � Os n�meros �mpares digitados;         ooooooooooooooooookkkkkkkk
        � A quantidade de n�meros �mpares digitados.  */

		Scanner kb = new Scanner(System.in);

        final int LIMITE=06;
        int []vetorA = new int[LIMITE];
        int []vetorB = new int [LIMITE];
        int somaPares=0,contImpares=0;

        Random sorteio = new Random();

        System.out.println("valores sorteados");
        for(int i=0;i<vetorA.length;i++)
        {
            vetorA[i]=sorteio.nextInt(20)+1;
            System.out.print(vetorA[i]+" ");
            vetorB[i]=vetorA[i];
        }
            System.out.println("\n");
            System.out.print("Valores Pares ");
            for(int i=0;i<vetorA.length;i++)
            {
                if(vetorB[i] % 2 == 0)
                {
                    somaPares=somaPares+vetorB[i];
                    System.out.print(vetorB[i]+" ");
                }

            }
            System.out.println();
            System.out.print("Valores �mpares ");
            for(int i=0;i<vetorA.length;i++)
            {
                if(vetorB[i] % 2 != 0)
                {
                    contImpares=contImpares+1;
                    System.out.print(vetorB[i]+" ");
                }

            }
            System.out.println("\nA soma dos numeros pares � igual a: "+somaPares);
            System.out.println("A quantidade de numeros impares digitados � igual a: "+contImpares);

	}

}
