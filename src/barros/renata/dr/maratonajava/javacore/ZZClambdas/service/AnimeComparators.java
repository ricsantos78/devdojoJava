package barros.renata.dr.maratonajava.javacore.ZZClambdas.service;

import barros.renata.dr.maratonajava.javacore.ZZClambdas.domain.Anime;

public class AnimeComparators {
    public static int compareByTitle(Anime a1, Anime a2) {
        return a1.getTitle().compareTo(a2.getTitle());
    }


    public static int compareByEpisdes(Anime a1, Anime a2) {
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
    }
}
