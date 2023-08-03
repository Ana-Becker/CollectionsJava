package org.example.exercicios;

import java.util.*;

public class ArcoIrisSet {

    public static void main(String[] args) {

        Set<String> coresAI = new TreeSet<>(Arrays.asList("Vermelho", "Laranja", "Amarelo", "Verde",
                "Azul", "Anil", "Violeta"));

        System.out.println("---- Cores do Arco-Íris ----");
        for (String cor:coresAI
             ) {
            System.out.println(cor);
        }

        System.out.println("---- Quantidade de cores ----");
        System.out.println(coresAI.size());

        System.out.println("---- Exiba na Ordem Inversa ----");
        /*Iterator<String> iterador = ((TreeSet<String>) coresAI).descendingIterator();
        while (iterador.hasNext()){
            System.out.println(iterador.next() + " ");
        }*/

        List<String> coresArcoIrisList = new ArrayList<>(coresAI);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);

        System.out.println("---- Exiba as cores que começam com a letra V ----");
        for (String cor:coresAI
             ) {
            if (cor.startsWith("V"))
                System.out.println(cor);
        }

        System.out.println("Remova todas as cores que não começam com a letra “v”: ");
        Iterator<String> iterator = coresAI.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if (next.startsWith("V"))
                iterator.remove();
        }
        System.out.println(coresAI);

    }
}
