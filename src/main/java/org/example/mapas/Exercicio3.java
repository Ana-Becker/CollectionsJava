package org.example.mapas;

import java.util.*;
import java.util.function.Function;

/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);

id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/
public class Exercicio3 {

    public static void main(String[] args) {

        Map<Integer, Contato> meusContatos = new HashMap<>(){{
            put(1, new Contato("Simba", 5555));
            put(4, new Contato("Cami", 1111));
            put(3, new Contato("Jon", 2222));
            put(2, new Contato("Amanda", 7777));
        }};

        System.out.println("--\tOrdem de ID\t--");
        meusContatos.entrySet().forEach(System.out::println);

        System.out.println("\n--\tOrdem Inserção\t--");
        Map<Integer, Contato> meusContatos1 = new LinkedHashMap<>(){{
            put(1, new Contato("Simba", 5555));
            put(4, new Contato("Cami", 1111));
            put(3, new Contato("Jon", 2222));
            put(2, new Contato("Amanda", 7777));
        }};
        meusContatos1.entrySet().forEach(System.out::println);

        System.out.println("\n--\tOrdem número telefone\t--");
        Set<Map.Entry<Integer, Contato>> entries1 = new TreeSet<>(Comparator.comparing(c -> c.getValue().getNumero()));
        entries1.addAll(meusContatos.entrySet());
        entries1.forEach(System.out::println);

        System.out.println("\n--\tOrdem nome contato\t--");
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(c -> c.getValue().getNome()));
        set.addAll(meusContatos1.entrySet());
        set.forEach(System.out::println);


    }
}
