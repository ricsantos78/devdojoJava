package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
//        List nomes = new ArrayList(); //Versao 1.4
        List<String> nomes = new ArrayList<>();//Versao 1.5
        List<String> nomes2 = new ArrayList<>();//Versao 1.5
        nomes.add("ricardo");
        nomes.add("DevDojo academy");
        nomes2.add("Duda");
        nomes2.add("DevDojo academy2");
        nomes.remove("ricardo");

        nomes.addAll(nomes2);

        //foreach
        for (String nome : nomes) {
            System.out.println(nome);
        }
        nomes.add("Santos");
        System.out.println("----------------------");

        //for tradicional
        for (int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }
        System.out.println("----------------------");
        System.out.println(nomes);

        System.out.println("----------------------");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }


    }
}
