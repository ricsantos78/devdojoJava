package barros.renata.dr.maratonajava.javacore.Ycolecoes.test;

import barros.renata.dr.maratonajava.javacore.Ycolecoes.domain.Manga;
import barros.renata.dr.maratonajava.javacore.Ycolecoes.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartPhoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }

}

class MangaPrecoComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartPhoneMarcaComparator());
        Smartphone smartphone = new Smartphone("0039", "nokia");
        set.add(smartphone);
        System.out.println(set);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(5L, "Berserk", 19.9, 0));
        mangas.add(new Manga(1L, "Hellsing Ultimate", 9.5, 0));
        mangas.add(new Manga(4L, "Pokemon", 3.2, 5));
        mangas.add(new Manga(3L, "Attack on titan", 11.20, 0));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99, 2));
        mangas.add(new Manga(10L, "Aaragon", 2.99, 2));

//        //Ordem de A~Z
//        for (Manga manga : mangas) {
//            System.out.println(manga);
//        }
//        System.out.println("----------------");
//        //Ordem de Z~A
//        for (Manga manga : mangas.descendingSet()) {
//            System.out.println(manga);
//        }

        //lower < retorna imediatamento o primeiro menor
        //floor <= mesmo elemnto ou imediatoa baixo dele
        //higher > retorna imediatamento o primeiro maior
        //ceiling >= mesmo elemnto ou imediatoa maior dele



        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga yuyu = new Manga(21L, "Yuyu Hakusho",3.2, 5);
        System.out.println("---------------------");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

        System.out.println("-------------------");
        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst()); //remove o primeiro
        System.out.println(mangas.size());

        System.out.println("-------------------");
        System.out.println(mangas.size());
        System.out.println(mangas.pollLast()); //remove o ultimo
        System.out.println(mangas.size());

    }
}
