package org.example.exstreams;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        List<Estudante> estudanteList = new ArrayList<>(){{
            add(new Estudante("João", 10));
            add(new Estudante("Maria", 12));
            add(new Estudante("Camila", 20));
            add(new Estudante("Rafael", 8));
            add(new Estudante("Jubliana", 18));
        }};

        System.out.println("-- Quantos estudantes tem na coleção? --\n" + estudanteList.stream().count());

        System.out.println("-- Filtre estudantes com idade superior ou igual a 18 anos --");
        System.out.println(estudanteList.stream().filter((estudante) -> estudante.getIdade() >= 18).collect(Collectors.toList()));

        System.out.println("-- Exiba cada elemento no Console --");
        estudanteList.stream().forEach(estudante -> System.out.println(estudante));

        System.out.println("-- Retorne estudantes com nome que possui a letra B --");
        System.out.println(estudanteList.stream().filter((estudante) -> estudante.getNome().toLowerCase().contains("b")).collect(Collectors.toList()));

        System.out.println("-- Retorne se existe ao menos um estudante com a letra D no nome --");
        System.out.println(estudanteList.stream().anyMatch((estudante) -> estudante.getNome().contains("d")));

        System.out.println("-- Retorne o estudante mais velhe e o mais nove da coleção  --");
        System.out.println("Mais velhe: " + estudanteList.stream().max(Comparator.comparingInt(Estudante::getIdade)));
        System.out.println("Mais nove: " + estudanteList.stream().min(Comparator.comparingInt(Estudante::getIdade)));
    }


}
