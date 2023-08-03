package org.example.exercicios;

import java.util.*;

public class Exercicio {

    public static void main(String[] args) {

        Set<String> arcoIris = new HashSet<>(Arrays.asList("Vermelho", "Laranja", "Amarelo", "Verde",
                "Azul", "Anil", "Violeta"));

        Set<String> arcoIrisTree = new TreeSet<>(arcoIris);

        System.out.println(arcoIris);
        Iterator<String> iterator = arcoIris.iterator();
        System.out.println("---- Cores do Arco-Íris uma abaixo da outra ----");
        while (iterator.hasNext()){
            System.out.println("                " + iterator.next() + "");
        }

        System.out.println("---- Quantidade de cores ----" + "\n" + arcoIris.size());

        System.out.println("---- Cores em Ordem Alfabética ----" + "\n" + arcoIrisTree);

        System.out.println("\n---- Ordem Inversa ----");

        List<String> arcoList = new ArrayList<>(arcoIrisTree);
        Collections.reverse(arcoList);
        System.out.println(arcoList);

        System.out.println("\n---- Cores que começam com a letra V ----");
        Iterator<String> iterator2 = arcoIrisTree.iterator();
        while (iterator2.hasNext()){
            if (iterator2.next().startsWith("V")){
                iterator2.remove();
            }
        }
        System.out.println(arcoIrisTree);

        System.out.println("\n---- Limpe o Conjunto ----");
        arcoIrisTree.clear();
        System.out.println(arcoIrisTree);

        System.out.println("\n---- Confira se está vazio ----");
        System.out.println(arcoIrisTree.isEmpty());


    }
}
