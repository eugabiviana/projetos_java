package Exercicio2Aviao;

public class Aviao {

	 public String modelo;
     public int capacidadePassageiros;
     public String ciaAerea;
     public int liga;


    public void mostraliga() 
    {
        if ( liga == 1)
        {
            System.out.println("o avi�o esta ligado");
        }
        else if(liga == 2)
        {
            System.out.println("o avi�o esta desligado");
        }
    }

    public void mostraModelo() 
    {
        System.out.printf("voc� ir� voar num aviao: %s ",modelo);
    }
	
}
