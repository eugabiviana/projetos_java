package Exercicio1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
		 * expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
		 */
		
		int horas, min, seg, eventoSeg;
		Scanner kb = new Scanner (System.in) ;
		
		System.out.println("Escreva o tempo do evento em segundos: ");
		eventoSeg = kb.nextInt();
		
		horas = (eventoSeg/3600);
		min = ((eventoSeg%3600)/60);
		seg = ((eventoSeg%3600)%60);
		
		System.out.println("O evento durou: "+horas+" horas, "+min+" minutos e "+seg+" segundos.");
		
		
		
	}

}
