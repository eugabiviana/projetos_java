package entidades;

public class Cachorro extends Animal{

    public Cachorro(String nome, int idade, String som, String a��o) {
        super(nome, idade, som, a��o);
    }

    public void  mostraSom() {
        System.out.println("o cachorro esta latindo");
    }




}