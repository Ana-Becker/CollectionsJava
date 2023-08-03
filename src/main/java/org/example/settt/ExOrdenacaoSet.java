package org.example.settt;

import java.util.*;

public class ExOrdenacaoSet {

    public static void main(String[] args) {

        Set<Serie> minhasSeries = new HashSet<>();
        minhasSeries.add(new Serie("got", "fantasia", 60));
        minhasSeries.add(new Serie("dark", "drama", 60));
        minhasSeries.add(new Serie("the Big Bang Theory", "comédia", 25));

        Set<Serie> minhasSeries2 = new LinkedHashSet<>();
        minhasSeries2.add(new Serie("got", "fantasia", 60));
        minhasSeries2.add(new Serie("dark", "drama", 60));
        minhasSeries2.add(new Serie("the Big Bang Theory", "comédia", 25));

        Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries2);

        System.out.println("Ordem Aleatória:\n" + minhasSeries);

        System.out.println("Ordem de Inserção:\n" + minhasSeries2);

        System.out.println("Ordem por tempo de episódio:\n" + minhasSeries3);

        System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio\t--");

        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparadorNomeGeneroTempo());
        minhasSeries4.addAll(minhasSeries);
        for (Serie serie:minhasSeries4
             ) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("--\tOrdem gênero\t--");
        Set<Serie> minhasSeries5 = new TreeSet<>(new CompararGenero());
        minhasSeries5.addAll(minhasSeries);
        for (Serie serie:minhasSeries5
             ) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

    }
}

class ComparadorNomeGeneroTempo implements Comparator <Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        int genero = s1.getGenero().compareToIgnoreCase(s2.getGenero());
        if (nome != 0){
            return nome;
        }if (genero != 0) {
            return genero;
        }
        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}

class CompararGenero implements Comparator<Serie>{

    @Override
    public int compare(Serie serie1, Serie serie2) {
        return serie1.getGenero().compareTo(serie2.getGenero());
    }
}
