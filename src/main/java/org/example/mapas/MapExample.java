package org.example.mapas;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {

        Map<String, String> estadosBr = new HashMap<>(){{
            put("SP", "São Paulo");
            put("MG", "Minas Gerais");
            put("MS", "Mato Grosso do Sul");
            put("MT", "Mato Grosso");
            put("GO", "Goias");
            put("MA", "Maranhão");
            put("TO", "Tocantins");
            put("RS", "Rio Grande do Sul");
            put("RJ", "Rio de Janeiro");
            put("ES", "Espirito Santo");
        }};

        System.out.println(estadosBr);

        System.out.println("--- Remova o Estado de Minas Gerais ---");
        estadosBr.remove("MG");
        System.out.println(estadosBr);

        System.out.println("--- Adicione o Distrito Federal ---");
        estadosBr.put("DF", "Distrito Federal");
        System.out.println(estadosBr);

        System.out.println("--- Verifique o tamanho do Mapa ---");
        System.out.println(estadosBr.size());

        System.out.println("--- Remova o Estado de Mato Grosso do Sul usando o nome ---");
        Iterator<String> iterator = estadosBr.values().iterator();
        while (iterator.hasNext()){
            if (iterator.next() == "Mato Grosso do Sul"){
                iterator.remove();
            }
        }
        System.out.println(estadosBr);

        System.out.println("--- Verifique o tamanho do Mapa ---");
        System.out.println(estadosBr.size());

        System.out.println("--- Navegue em todos os registros do map, mostrando no console no formato: NOME (SIGLA) ---");
        Set<Map.Entry<String, String>> entries = estadosBr.entrySet();
        for (Map.Entry<String, String> entry: entries
             ) {
            System.out.println(entry.getValue() + " (" + entry.getKey() + ")");
        }

        System.out.println("--- Verifique se o estado de Santa Catarina existe no map buscando por sua sigla (SC)");
        System.out.println(estadosBr.containsKey("SC"));

        System.out.println("--- Verifique se o estado do Maranhão existe no map buscando por seu nome");
        System.out.println(estadosBr.containsValue("Maranhão"));


    }
}
