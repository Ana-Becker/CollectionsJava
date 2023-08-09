package org.example.exstreams;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExerciciosStreamAPI {

    public static void main(String[] args) {

        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
        System.out.println(numerosAleatorios);

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())               // vai coletar o que eu pedi e fazer um Set.
                .forEach(System.out::print);             // imprimir cada elemento desse meu novo Set.

        System.out.println("\nTransforme esta lista de String em uma lista de números inteiros.");
        /*numerosAleatorios.stream()
                .map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s);
                    }
                })
                .collect(Collectors.toList())
                .forEach(System.out::println);*/


        List<Integer> numerosAleatoriosInt = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(numerosAleatoriosInt);

        System.out.println("Pegue os números pares e maiores que 2 " +
                "e coloque em uma lista:");

        /*numerosAleatoriosInt.stream()
                .filter(i -> i%2 == 0 && i>2)
                .collect(Collectors.toList())
                .forEach(System.out::println);*/

        List<Integer> lista2 = numerosAleatoriosInt.stream()
                .filter(i -> i%2 == 0 && i>2)
                .toList();
        System.out.println(lista2);

        System.out.println("Mostre a média dos números: ");
        /*Iterator<Integer> iterator = numerosAleatoriosInt.stream().iterator();
        int soma = 0;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma / numerosAleatoriosInt.stream().count());*/

        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);



        System.out.println("Remova os valores ímpares: ");
        /*numerosAleatoriosInt.stream()
                .filter(i -> i%2 ==0)
                .collect(Collectors.toList())
                .forEach(System.out::println);*/

        /*numerosAleatoriosInt.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                if (i %2 != 0){
                    return true;
                }
                return false;
            }
        });*/

        numerosAleatoriosInt.removeIf(i -> i %2 != 0);
        System.out.println(numerosAleatoriosInt);


        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
        List<String> semOs3Primeiros = numerosAleatorios.stream()
                .skip(3)
                .collect(Collectors.toList());
        System.out.println(semOs3Primeiros);

        long countNumerosUnicos = numerosAleatorios.stream()
                .distinct()
                .count();
        System.out.println("Retirando os números repetidos da lista, " +
                "quantos números ficam? " + countNumerosUnicos);

        System.out.print("Mostre o menor valor da lista: ");
        List<Integer> numerosAleatoriosInt1 = new ArrayList<>(numerosAleatorios.stream()
                .map(Integer::parseInt)
                .toList());

        numerosAleatoriosInt1.stream()
                .mapToInt(Integer::intValue)
                .min()
                .ifPresent(System.out::println);

        System.out.print("Mostre o maior valor da lista: ");
        numerosAleatoriosInt1.stream()
                .mapToInt(Integer::intValue)
                .max()
                .ifPresent(System.out::println);


        int somaNumerosPares = numerosAleatoriosInt1.stream()
                .filter(i -> i % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Pegue apenas os números pares e some: " + somaNumerosPares);

        System.out.println("Mostre a lista na ordem númerica: ");
        List<Integer> ordemNumerica = numerosAleatoriosInt1.stream()
                .sorted(Comparator.naturalOrder())
                .toList();
        System.out.println(ordemNumerica);

        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
        Map<Boolean, List<Integer>> numerosMultiplosDe3OU5 = numerosAleatoriosInt1.stream()
                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
        System.out.println(numerosMultiplosDe3OU5);


    }

    }

