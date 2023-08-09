package org.example.settt;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {

        HashSet<Integer> meusNumeros = new HashSet<>(){{
            add(7);
            add(88);
            add(20);
            add(44);
            add(3);
        }};
        System.out.println("---- HashSet ----");
        System.out.println(meusNumeros);

        System.out.println("---- Removendo o primeiro item do Set ----");
        System.out.println(" O HashSet não possui index");

        System.out.println("---- Adicionando um novo número: 23 ----");
        meusNumeros.add(23);
        System.out.println(meusNumeros);

        System.out.println("---- Verifique o tamanho do Set e se ele está vazio ----");
        System.out.println(meusNumeros.size());
        System.out.println(meusNumeros.isEmpty());
        LinkedHashSet<Integer> meusNumeros1 = new LinkedHashSet<>(){{
            add(7);
            add(88);
            add(20);
            add(44);
            add(3);
        }};
        System.out.println("\n---- LinkedHashSet ----");
        System.out.println(meusNumeros1);
        System.out.println("---- Removendo o primeiro item do Set ----");
        meusNumeros1.remove(3);
        System.out.println(meusNumeros1);
        System.out.println("---- Adicionando um novo número: 23 ----");
        meusNumeros1.add(23);
        System.out.println(meusNumeros1);

        TreeSet<Integer> meusNumeros2 = new TreeSet<>() {{
            add(7);
            add(88);
            add(20);
            add(44);
            add(3);
        }};
        System.out.println("\n---- TreeSet ----");
        System.out.println(meusNumeros2);
        System.out.println("---- Removendo o primeiro item do Set ----");
        meusNumeros2.remove(meusNumeros2.first());
        System.out.println(meusNumeros2);
        System.out.println("---- Qual o número abaixo do 44?");
        System.out.println(meusNumeros2.lower(44));
        System.out.println("---- Qual o número acima do 44?");
        System.out.println(meusNumeros2.higher(44));
        System.out.println("---- Adicionando um novo número: 23 ----");
        meusNumeros2.add(23);
        System.out.println(meusNumeros2);
    }
}
