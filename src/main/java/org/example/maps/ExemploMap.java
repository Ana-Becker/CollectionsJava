package org.example.maps;

import java.util.*;

public class ExemploMap {

    public static void main(String[] args) {

        /*
 Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
 modelo = gol - consumo = 14,4km/l
 modelo = uno - consumo = 15,6 km/l
 modelo = mobi - consumo = 16,1 km/l
 modelo = hb20 - consumo = 14,5 km/l
 modelo = kwid - consumo = 15,6 km/l
 */

        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares);

        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno") + " km/h");

        Set<String> modelos = carrosPopulares.keySet();
        System.out.println("Exiba os modelos: " + modelos);

        Collection<Double> consumos = carrosPopulares.values();
        System.out.println("Exiba os consumos dos carros: " + consumos);

        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        Double maxConsumo = Collections.max(consumos);
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEconomico = "";
        for (Map.Entry<String, Double> entry:entries
             ) {
            if (entry.getValue() == maxConsumo){
                modeloMaisEconomico = entry.getKey();
            }
        }
        System.out.println(modeloMaisEconomico + " -> " + maxConsumo + " km/h");

        System.out.println("Exiba o modelo menos econômico e seu consumo: " );
        Double consumoMenosEconomico = Collections.min(consumos);
        String modeloMenosEconomico = "";
        for (Map.Entry<String, Double> entry:entries
             ) {
            if (entry.getValue() == consumoMenosEconomico){
                modeloMenosEconomico = entry.getKey();
            }
        }
        System.out.println(modeloMenosEconomico + " -> " + consumoMenosEconomico + " km/h");

        Iterator<Double> iterator = consumos.iterator();
        double soma = 0;
        while (iterator.hasNext()){
            soma += iterator.next();
        }

        System.out.println("Exiba a soma dos consumos: " + soma);

        System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (soma/carrosPopulares.size()));

        System.out.println(carrosPopulares);
        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");

        Iterator<Double> iterator2 = carrosPopulares.values().iterator();
        while (iterator2.hasNext()){
            if (iterator2.next().equals(15.6)){
                iterator2.remove();
            }
        }
        System.out.println(carrosPopulares);

        System.out.println("Exiba todos os carros na ordem em que foram informados: ");

        Map<String, Double> carrosPopularesLinked = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopularesLinked);

        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopularesTree = new TreeMap<>(carrosPopularesLinked);
        System.out.println(carrosPopularesTree);

        System.out.println("Apague o dicionario de carros: ");
        carrosPopulares.clear();

        System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());





    }
}
