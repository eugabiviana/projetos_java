package TesteTenario;

import java.util.Locale;
import java.util.Scanner;

public class TesteTemario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		
		String sexo, F, f, M, m, O, o;
		
		System.out.println("Digite F, para feminino, M para masculino e O para outro.");
		sexo=kb.next();
		
		/* if(f || F);
		{
			System.out.println("Feminino");
		}
		else if (m || M);
		{
			System.out.println("Masculino");
		}
		else
			
			System.out.println("Outro");
		*/
	
	
		System.out.println (f || F) ?: "Feminino"; (m || M)?:"Masculino"; "Outro"; 
		
		
		kb.close();
	}

}
