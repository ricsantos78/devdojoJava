package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {

        //A VANTAGEM DO SET NAO PERMITE VALOR DUPLICADO
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(1L, "Berserk", 19.9,5));
        mangas.add(new Manga(5L, "Hellsing Ultimate", 9.5,0));
        mangas.add(new Manga(4L, "Pokemon", 3.2,0));
        mangas.add(new Manga(3L, "ATtack on titan", 11.20,2));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99,0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
