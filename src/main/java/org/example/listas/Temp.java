package org.example.listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Temp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List <Double> temperaturas = new ArrayList<>();
        System.out.println("Digite a temperatura média dos 6 primeiros meses do ano");
        //System.out.println("1 - Janeiro");
        temperaturas.add(20.5);
        //System.out.println("2 - Fevereiro");
        temperaturas.add(22d);
        //System.out.println("3 - Março");
        temperaturas.add(15.3);
        //System.out.println("4 - Abril");
        temperaturas.add(20.2);

        System.out.println("Temperaturas: " + temperaturas);

        Iterator<Double> iterator = temperaturas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double prox = iterator.next();
            soma += prox;
        }

        Double media = (soma/temperaturas.size());
        System.out.println("Média = " + media + " ºC");
        System.out.println("Temperaturas acima da média:");

        for (Double temp:temperaturas
             ) {
            if (temp > media){
                int index = temperaturas.indexOf(temp);
                switch (index){
                    case 0:
                        System.out.println((index + 1) + " - Janeiro = " + temp + " ºC");
                        break;
                    case 1:
                        System.out.println((index + 1) + " - Fevereiro = " + temp + " ºC");
                        break;
                    case 2:
                        System.out.println((index + 1) + "- Março = " + temp + " ºC");
                        break;
                    case 3:
                        System.out.println((index + 1) + " - Abril = " + temp + " ºC");
                        break;
                }
            }
        }

    }
}
