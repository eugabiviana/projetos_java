package Exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
				
		double cNovo, custF;
		double PERD=0.28, IMP=0.45;
		
		System.out.println("Olá! Digite o custo do carro: ");
		custF=kb.nextDouble();
		
		cNovo = (custF + (custF*PERD)+(custF*IMP));
		
		System.out.printf("O valor repassado ao consumidor será de: R$"+cNovo+" .");

		
		kb.close();
	}

}
