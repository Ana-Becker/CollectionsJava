package org.example.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExArrayList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>(){{
            add("Juliana");
            add("Pedro");
            add("Carlos");
            add("Larissa");
            add("João");
        }};

        System.out.println(nomes);
        /*for (String n:nomes
             ) {
            System.out.println(n);
        }*/

        System.out.println("-- Substitua o nome Carlos por Roberto --");
        nomes.set(2, "Roberto");
        System.out.println(nomes);

        System.out.println("-- Retorne o nome da posição 1 --");
        System.out.println(nomes.get(0));

        System.out.println("-- Remova o nome da Posição 4 --");
        nomes.remove(3);
        System.out.println(nomes);

        System.out.println("-- Remova o nome João --");
        nomes.remove("João");
        System.out.println(nomes);

        System.out.println("-- Retorne a quantidade de itens da lista --");
        System.out.println(nomes.size());

        System.out.println("-- Verifique se o nome Juliano existe na lista --");
        System.out.println(nomes.contains("Juliano"));

        System.out.println("-- Crie uma nova lista com os nomes Ismael e Rodrigo. Adicione-os na primeira lista criada --");
        List<String> nomes1 = new ArrayList<>(){{
            addAll(nomes);
            add("Ismael");
            add("Rodrigo");
        }};

        System.out.println(nomes1);

        System.out.println("-- Ordene os itens da lista em ordem alfabética --");
        Collections.sort(nomes1);
        System.out.println(nomes1);

        System.out.println("-- Verifique se a lista está vazia --");
        System.out.println(nomes1.isEmpty());
    }
}
