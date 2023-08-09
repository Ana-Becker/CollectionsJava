package org.example.listas;

import java.util.*;

public class Gatos {

    public static void main(String[] args) {

        /*Dadas as seguintes informações sobre meus gatos, crie uma lista
e ordene esta lista exibindo:
(nome - idade - cor);

Gato 1 = nome: Jon, idade: 18, cor: preto
Gato 2 = nome: Simba, idade: 6, cor: tigrado
Gato 3 = nome: Jon, idade: 12, cor: amarelo
*/

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
            add(new Gato("Zaza", 5, "branca"));
        }};

        System.out.println("---- Por ordem de Inserção ---- \n" + meusGatos.toString());
        System.out.println("\n---- Por ordem aleatória ----");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("\n---- Por ordem alfabética ----");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("\n---- Por idade ----");
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("\n---- Por cor ----");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("\n---- Por Nome/Cor/Idade ----");
        meusGatos.sort(new ComparatorNomeIdadeCor());
        System.out.println(meusGatos);

    }
}

class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {

        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeIdadeCor implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if ( nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0 ) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}
