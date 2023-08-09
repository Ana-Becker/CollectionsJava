package org.example.exercicios;

import java.util.*;

public class Filmes {

    public static void main(String[] args) {

        Set<Filme> filmesFavoritos = new HashSet<>();
        filmesFavoritos.add(new Filme("Appenheimer", 2023, "Drama"));
        filmesFavoritos.add(new Filme("A Origem", 2010, "Ficção Científica"));
        filmesFavoritos.add(new Filme("Interestelar", 2014, "Ficção Científica"));

        System.out.println(filmesFavoritos);

        System.out.println("---- Por Ordem de Inserção: ");
        Set<Filme> filmesFavoritos1 = new LinkedHashSet<>();
        filmesFavoritos1.add(new Filme("Oppenheimer", 2023, "Drama"));
        filmesFavoritos1.add(new Filme("A Origem", 2010, "Ficção Científica"));
        filmesFavoritos1.add(new Filme("Interestelar", 2014, "Ficção Científica"));
        for (Filme f:filmesFavoritos1
             ) {
            System.out.println(f);
        }

        List<Filme> filmesList = new ArrayList<>(filmesFavoritos);

        System.out.println("---- Por Ordem Alfabética(nome): ");
        Set<Filme> filmeSet = new TreeSet<>(filmesFavoritos);
        for (Filme f:filmeSet
             ) {
            System.out.println(f);
        }
        /*CompararNome compararNome = new CompararNome();
        Collections.sort(filmesList, compararNome);
        for (Filme f:filmesList
             ) {
            System.out.println(f);
        }*/

        System.out.println("---- Por Gênero: ");
        CompararGenero compararGenero = new CompararGenero();
        Collections.sort(filmesList, compararGenero);
        /*Set<Filme> meusfilmes = new TreeSet<>(new CompararGenero());
        meusfilmes.addAll(filmesFavoritos);*/
        for (Filme f:filmesList
             ) {
            System.out.println(f);
        }

        System.out.println("---- Por Ano e Nome: ");
        /*CompararNomeAno compararNomeAno = new CompararNomeAno();
        Collections.sort(filmesList, compararNomeAno);*/
        Set<Filme> meusFilmes2 = new TreeSet<>(new CompararNomeAno());
        meusFilmes2.addAll(filmesFavoritos);
        for (Filme f:meusFilmes2
             ) {
            System.out.println(f);
        }

        System.out.println("---- Por Nome, Ano e Gênero ----");
        CompararNomeAnoGenero compararNomeAnoGenero = new CompararNomeAnoGenero();
        Collections.sort(filmesList, compararNomeAnoGenero);
        for (Filme f:filmesList
             ) {
            System.out.println(f);
        }

        List<Filme> meusFilmes = new ArrayList<>(){{
            add(new Filme("A Bela Adormecida", 1959, "Desenho"));
            add(new Filme("O Poderoso Chefão", 1972, "Drama"));
            add(new Filme("Um Sonho de Liberdade", 1995, "Drama"));
            add(new Filme("O Rei Leão", 1994, "Animação"));
            add(new Filme("O Senhor dos Anéis", 2003, "Fantasia"));
        }};

        meusFilmes.sort(Comparator.comparing(Filme::getNome));
        System.out.println();
        meusFilmes.stream().forEach(System.out::println);


    }
}

class CompararNome implements Comparator<Filme>{

    @Override
    public int compare(Filme o1, Filme o2) {

        return o1.getNome().compareTo(o2.getNome());
    }
}

class CompararGenero implements Comparator<Filme>{

    @Override
    public int compare(Filme o1, Filme o2) {

        return o1.getGenero().compareTo(o2.getGenero());
    }
}

class CompararNomeAno implements Comparator<Filme>{

    @Override
    public int compare(Filme o1, Filme o2) {
        if (o1.getAnoLancamento() > o2.getAnoLancamento()){
            return o1.getAnoLancamento();
        } else {
        return o1.getNome().compareTo(o2.getNome());
        }
    }
}

class CompararNomeAnoGenero implements Comparator<Filme>{

    @Override
    public int compare(Filme o1, Filme o2) {
        if (o1.getNome().compareTo(o2.getNome()) != 0){
            return o1.getNome().compareTo(o2.getNome());
        } if (o1.getAnoLancamento() > o2.getAnoLancamento()){
            return o1.getAnoLancamento();
        }
        return o1.getGenero().compareTo(o2.getGenero());
    }
}