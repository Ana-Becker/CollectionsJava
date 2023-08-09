package org.example.mapas;

import java.util.*;

public class ExemploOrdenacaoMap {

    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");
        Map<String, LivroOrdMap> meusLivros = new HashMap<>(){{
            put("Uma breve história no tempo", new LivroOrdMap("Hawking, Stephen", 256));
            put("O Poder do Hábito", new LivroOrdMap("Duhigg, Charles", 408));
            put("21 Lições Para o Século 21", new LivroOrdMap("Harari, Yuval Noah", 432));
        }};

        for (Map.Entry<String, LivroOrdMap> l:meusLivros.entrySet()
             ) {
            System.out.println(l.getKey() + " - " + l.getValue().getNomeAutor() + " - " + l.getValue().getNumPaginas() + " pags.");
        }

        System.out.println("--\tOrdem Inserção\t--");
        Map<String, LivroOrdMap> meusLivros1 = new LinkedHashMap<>(){{
            put("Uma breve história no tempo", new LivroOrdMap("Hawking, Stephen", 256));
            put("O Poder do Hábito", new LivroOrdMap("Duhigg, Charles", 408));
            put("21 Lições Para o Século 21", new LivroOrdMap("Harari, Yuval Noah", 432));
        }};

        for (Map.Entry<String, LivroOrdMap> l:meusLivros1.entrySet()) {
            System.out.println(l.getKey() + " - " + l.getValue().getNomeAutor() + " - " + l.getValue().getNumPaginas() + " pags.");
        }

        System.out.println("--\tOrdem alfabética autores\t--");
        Set<Map.Entry<String, LivroOrdMap>> mapSet = new TreeSet<>(new CompararNomeAutor());
        mapSet.addAll(meusLivros1.entrySet());
        for (Map.Entry<String, LivroOrdMap> l:mapSet) {
            System.out.println(l.getKey() + " - " + l.getValue().getNomeAutor() + " - " + l.getValue().getNumPaginas() + " pags.");
        }


        System.out.println("--\tOrdem alfabética nomes dos livros\t--");
        Map<String, LivroOrdMap> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, LivroOrdMap> l:meusLivros2.entrySet()) {
            System.out.println(l.getKey() + " - " + l.getValue().getNomeAutor() + " - "
                    + l.getValue().getNumPaginas() + " pags.");
        }

        System.out.println("--\tOrdem número de página\t--");
        Set<Map.Entry<String, LivroOrdMap>> map2 = new TreeSet<>(new CompararNumPags());
        map2.addAll(meusLivros2.entrySet());
        for (Map.Entry<String, LivroOrdMap> livro:map2
             ) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNomeAutor()
                    + " - " + livro.getValue().getNumPaginas() + " pags.");
        }


    }
}

class CompararNomeAutor implements Comparator<Map.Entry<String, LivroOrdMap>>{

    @Override
    public int compare(Map.Entry<String, LivroOrdMap> o1, Map.Entry<String, LivroOrdMap> o2) {
        return o1.getValue().getNomeAutor().compareTo(o2.getValue().getNomeAutor());
    }
}

class CompararNumPags implements Comparator<Map.Entry<String, LivroOrdMap>>{

    @Override
    public int compare(Map.Entry<String, LivroOrdMap> l1, Map.Entry<String, LivroOrdMap> l2) {
        return l1.getValue().getNumPaginas().compareTo(l2.getValue().getNumPaginas());
    }
}
