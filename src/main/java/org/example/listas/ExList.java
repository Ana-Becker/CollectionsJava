package org.example.listas;

import java.util.*;
import java.util.List;

public class ExList {

    public static void main(String[] args) {

        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

        //List<Double> notas = new ArrayList<>();

        /*List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);*/

        /*List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);   Se fizer assim, não pode adicionar nem remover elementos na lista.
        notas.add(10d);
        System.out.println(notas);*/

        /*List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);  Este modo também, fica imutável.
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);*/

        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);

        System.out.println(notas);

        System.out.println("Posição da nota 5: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4,8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d),6d );
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (double nota:notas
             ) {
            System.out.print(nota + " ");
        }

        System.out.println("\nTerceira nota: " + notas.get(2));
        System.out.println("Menor nota: " + Collections.min(notas));
        System.out.println("Maior nota: " + Collections.max(notas));

        Iterator<Double> iterador = notas.iterator();
        Double soma = 0d;
        while (iterador.hasNext()){
            Double next = iterador.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);
        System.out.println("Exiba a média das notas: " + (soma / notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");

        Iterator<Double> iterator1 = notas.iterator();

        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7){
                iterator1.remove();
            }
        }
        System.out.println(notas);





    }
}
