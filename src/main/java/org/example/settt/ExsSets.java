package org.example.settt;

import java.util.*;

public class ExsSets {

    public static void main(String[] args) {

        //Set<Double> notas = new HashSet<>();
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println("Perceba que saiu desordenado:\n" + notas);

        System.out.println("\nConfira se a nota 5 está no conjunto: " + notas.contains(5d));

        System.out.println("\nExiba a menor nota: " + Collections.min(notas));

        System.out.println("\nExiba a maior nota: " + Collections.max(notas));

        Double soma = 0d;

        for (double nota:notas
             ) {
            soma += nota;
        }

        System.out.println("\nExiba a soma das notas: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/ notas.size()));

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7d) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("\nExiba todas as notas na ordem em que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas2);

        System.out.println("\nExiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas3);

    }
}
