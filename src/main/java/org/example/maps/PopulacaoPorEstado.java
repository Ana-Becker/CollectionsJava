package org.example.maps;

import java.util.*;

public class PopulacaoPorEstado {

    public static void main(String[] args) {

        Map<String, Long> populacoes = new HashMap<>(){{
           put("PE", 9616621L);
           put("AL", 3351543L);
           put("CE", 9187103L);
           put("RN", 3534265L);
        }};

        System.out.println("---- Relacione os estados e suas populações ----");
        for (Map.Entry<String, Long> p:populacoes.entrySet()
             ) {
            System.out.println(p.getKey() + " = " + p.getValue());
        }

        System.out.println("---- Substitua a população do estado do RN por 3.534.165 ----");
        populacoes.put("RN", 3534165L);
        for (Map.Entry<String, Long> p:populacoes.entrySet()
        ) {
            System.out.println(p.getKey() + " = " + p.getValue());
        }

        System.out.println("-- Confira se o estado PB está no dicionário, caso não adicione: PB - " +
                "4.039.277 --");
        System.out.println(populacoes.containsKey("PB"));
        populacoes.put("PB", 4039277L);
        for (Map.Entry<String, Long> p:populacoes.entrySet()
        ) {
            System.out.println(p.getKey() + " = " + p.getValue());
        }

        System.out.println("-- Exiba todos os estados e suas populações na ordem que foi " +
                "informado --");

        Map<String, Long> populacoes1 = new LinkedHashMap<>(){{
            put("PE", 9616621L);
            put("AL", 3351543L);
            put("CE", 9187103L);
            put("RN", 3534265L);
            put("PB", 4039277L);
        }};
        for (Map.Entry<String, Long> p:populacoes1.entrySet()
        ) {
            System.out.println(p.getKey() + " = " + p.getValue());
        }

        System.out.println("-- Exiba os estados e suas populações em ordem alfabética --");
        Map<String, Long> populacoes2 = new TreeMap<>(populacoes1);
        for (Map.Entry<String, Long> p:populacoes2.entrySet()
        ) {
            System.out.println(p.getKey() + " = " + p.getValue());
        }

        System.out.println("-- Exiba o estado com a menor população e sua quantidade --");
        Set<Map.Entry<String, Long>> entries = populacoes1.entrySet();
        Long menorPop = Collections.min(populacoes1.values());
        for (Map.Entry<String, Long> entry:entries
             ) {
            if (entry.getValue().equals(menorPop)){
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }

        System.out.println("-- Exiba o estado com a maior população e sua quantidade --");
        Long maiorPopulacao = Collections.max(populacoes1.values());
        for (Map.Entry<String, Long> entry:entries
             ) {
            if (entry.getValue().equals(maiorPopulacao)){
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }

        System.out.println("-- Exiba a soma da população desses estados --");
        Long soma = Long.valueOf(0);
        Iterator<Map.Entry<String, Long>> iterator = entries.iterator();
        while (iterator.hasNext()){
            soma += iterator.next().getValue();
        }
        System.out.println(soma);

        System.out.println("-- Exiba a média da população deste dicionário de estados --");
        System.out.println((soma / populacoes2.size()));

        System.out.println("-- Remova os estados com a população menor que 4.000.000 --");

        Set<Map.Entry<String, Long>> entries1 = populacoes2.entrySet();
        Iterator<Map.Entry<String, Long>> iterator1 = entries1.iterator();

        while (iterator1.hasNext()){
            if (iterator1.next().getValue() < 4000000){
                iterator1.remove();
            }
        }
        for (Map.Entry<String, Long> pop:populacoes2.entrySet()
             ) {
            System.out.println(pop.getKey() + " - " + pop.getValue());
        }

        System.out.println("-- Apague o dicionário de estados --");
        populacoes2.clear();
        System.out.println(populacoes2);

        System.out.println("-- Confira se o dicionário está vazio --");
        System.out.println(populacoes2.isEmpty());




    }
}
