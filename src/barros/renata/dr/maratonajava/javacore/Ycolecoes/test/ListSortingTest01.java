package barros.renata.dr.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortingTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Berserk");
        mangas.add("Hellsing Ultimate");
        mangas.add("Pokemon");
        mangas.add("ATtack on titan");
        mangas.add("Dragon Ball Z");
        Collections.sort(mangas); //Ordenar um elemento dentro de uma lista

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23D);
        dinheiros.add(23.98);
        dinheiros.add(21.21);
        dinheiros.add(98.10);
        Collections.sort(dinheiros);

        for (String s : mangas) {
            System.out.println(s);
        }
        for (Double dinheiro : dinheiros) {
            System.out.println(dinheiro);
        }


    }
}
