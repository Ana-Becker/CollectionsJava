package org.example.exercicios;

import java.util.*;

public class LancamentoDados {

    public static void main(String[] args) {

        Set<Integer> meuDado = new HashSet<>(){{
           add(1);
           add(2);
           add(3);
           add(4);
           add(5);
           add(6);
        }};

        System.out.println(meuDado);

        // converter o HashSet em um array - criei um array de int e o chamei de numerosDado, que é o HashSet
        // meuDado com o toArray e aí criei um novo array de Integer com o tamanho do meuDado.
        Integer[] numerosDado = meuDado.toArray(new Integer[meuDado.size()]);

        // gerar um numero aleatório
        Random aleatorio = new Random();

        // isso irá gerar um número aleatório entre 0 e o HashSet.size - 1
        int numeroAleatorio = aleatorio.nextInt(meuDado.size());

        // pegar o elemento do index do numero aleatório
        System.out.println("Número aleatório: " + numerosDado[numeroAleatorio]);


    }
}
