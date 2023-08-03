package org.example.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Perguntas {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> respostas = new ArrayList<>();

        System.out.println("Telefonou para a vítima?");
        respostas.add(scan.next());
        System.out.println("Esteve no local do crime?");
        respostas.add(scan.next());
        System.out.println("Mora perto da vítima?");
        respostas.add(scan.next());
        System.out.println("Devia para a vítima?");
        respostas.add(scan.next());
        System.out.println("Já trabalhou com a vítima?");
        respostas.add(scan.next());

        int sim = 0;
        int nops = 0;

        for (String r:respostas
             ) {
            if (r.equalsIgnoreCase("s")){
                sim ++;
            } else
                nops ++;
        }

        if (sim == 2){
            System.out.println("Suspeita");
        } else if (sim > 2 && sim < 5) {
            System.out.println("Cúmplice");
        } else if (sim == 5){
            System.out.println("Assassino");
        } else
            System.out.println("Inocente");
    }
}
