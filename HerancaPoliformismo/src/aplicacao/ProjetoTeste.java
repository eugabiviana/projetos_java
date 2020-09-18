package aplicacao;

import java.util.ArrayList;
import java.util.List;

import entidades.Animal;
import entidades.Cachorro;
import entidades.Cavalo;
import entidades.Pregui�a;

public class ProgramaTeste {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("O cachorrooo",7," esta latindoooooo","corre");
        Cavalo cavalo = new Cavalo("O cavalooo",10,"est� relinxandooooo","corre");
        Pregui�a pregui�a = new Pregui�a("A pregui�aaa",5,"est� bocejaandoooooo","sobe em arvores");

        System.out.println("         A��O DOS BICHOS");

        List<Animal> list = new ArrayList<>();

                list.add(new Cachorro("O cachorroo",7,"esta latindoooooo","corre"));
                list.add(new Cavalo("O cavaloooo",10,"est� relinxandooooo","corre"));
                list.add(new Pregui�a("A pregui�aaa",5,"est� bocejaandoooooo","sobe em arvores"));

                for(Animal animal : list) {
                    System.out.println("\n"+animal.getNome()+" "+animal.getSom());
                }

    }
}