package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(5L, "Berserk", 19.9,0));
        mangas.add(new Manga(1L, "Hellsing Ultimate", 9.5,0));
        mangas.add(new Manga(4L, "Pokemon", 3.2,5));
        mangas.add(new Manga(3L, "ATtack on titan", 11.20,0));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99,2));

        //Iterator Checa antes de fazer alguma ação
//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()){
//            if(mangaIterator.next().getQuantidade() == 0)mangaIterator.remove();
//        }
        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
