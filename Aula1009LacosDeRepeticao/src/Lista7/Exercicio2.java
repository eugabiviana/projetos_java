package Lista7;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		
		int numero, contpar=0,contImpar=0;

        for (numero=1;numero<=10;numero++)
        {
            System.out.printf("%d ",numero);

            if(numero % 2 == 0)
            {

                contpar=contpar+1;
            }
            else
            {
                contImpar=contImpar+1;
            }
        }

        System.out.println("\n\na quantidade de numeros pares � igual a "+contpar);
        System.out.println("a quantidade de numeros �mpares � igual a "+contImpar);
				
		
		kb.close();
	}

}
