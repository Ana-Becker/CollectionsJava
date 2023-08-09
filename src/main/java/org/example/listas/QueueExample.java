package org.example.listas;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<String> nomes = new LinkedList<>(){{
            add("Juliana");
            add("Pedro");
            add("Carlos");
            add("Larissa");
            add("João");
        }};
        System.out.println(nomes);

        System.out.println("-- Retorne o primeiro item da fila, sem removê-lo --");
        System.out.println(nomes.peek());
        System.out.println(nomes);

        System.out.println("-- Retorne o primeiro item da fila, removendo-o --");
        System.out.println(nomes.poll());
        System.out.println(nomes);

        System.out.println("-- Adicione um novo nome: Daniel. Verifique a posição que ele assumiu na fila --");
        nomes.add("Daniel");
        System.out.println(nomes);

        System.out.println("-- Retorne o tamanho da Lista --");
        System.out.println(nomes.size());

        System.out.println("-- Verifique se o nome Carlos está na lista --");
        System.out.println(nomes.contains("Carlos"));
    }
}
