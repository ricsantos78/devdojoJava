package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();//LinkedHashMap<>() ordena o map pela ordem que foi adicionada
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "voce");
        map.putIfAbsent("vc2", "voce");
        System.out.println(map);

        //For Retornando pela chave
        for (String s : map.keySet()) {
            System.out.println(s + " : " + map.get(s));
        }
        System.out.println("-------------------------");
        //For Retornando pelo valor
        for (String s : map.values()) {
            System.out.println(s);
        }
        System.out.println("-------------------------");

        //For Retornando tanto chave quanto valor
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            System.out.println(stringStringEntry.getKey()+ "-"+ stringStringEntry.getValue());
        }


    }
}
