package barros.renata.dr.maratonajava.javacore.Ycolecoes.test;

import barros.renata.dr.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L, "Berserk", 19.9));
        mangas.add(new Manga(1L, "Hellsing Ultimate", 9.5));
        mangas.add(new Manga(4L, "Pokemon", 3.2));
        mangas.add(new Manga(3L, "ATtack on titan", 11.20));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Collections.sort(mangas);
        System.out.println("---------------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Collections.sort(mangas, new MangaByIdComparator());
        System.out.println("---------------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
