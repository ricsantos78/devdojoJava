package barros.renata.dr.maratonajava.javacore.Ycolecoes.test;

import barros.renata.dr.maratonajava.javacore.Ycolecoes.domain.Consumidor;
import barros.renata.dr.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(5L, "Berserk", 19.9, 0));
        mangas.add(new Manga(1L, "Hellsing Ultimate", 9.5, 0));
        mangas.add(new Manga(4L, "Pokemon", 3.2, 5));
        mangas.add(new Manga(3L, "Attack on titan", 11.20, 0));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99, 2));
        mangas.add(new Manga(10L, "Aaragon", 2.99, 2));

        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }

    }
}
