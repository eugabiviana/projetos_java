package aplicacao;

import entidades.Animal;
import entidades.Cachorro;
import entidades.Cavalo;
import entidades.Preguica;

public class ProjetoTeste {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("O cachorrooo",7);
        Cavalo cavalo = new Cavalo("O cavalooo",10);
        Preguica pregui�a = new Preguica("A pregui�aaa",5);

        System.out.println("A��O DOS BICHOS\n");

            cachorro.mostraSom();
            cachorro.mostraacao();

            System.out.println();

            cavalo.mostraSom();
            cavalo.mostraacao();

            System.out.println();

            pregui�a.mostraSom();
            pregui�a.mostraacao();

    }
}