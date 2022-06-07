package barros.renata.dr.maratonajava.javacore.ZZClambdas.test;

import barros.renata.dr.maratonajava.javacore.ZZClambdas.domain.Anime;
import barros.renata.dr.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43),
                new Anime("One Piece", 100),
                new Anime("Naruto", 500)));
        // animeList.sort((a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        // animeList.sort(AnimeComparators::compareByTitle);
        animeList.sort(AnimeComparators::compareByEpisdes);
        System.out.println(animeList);
    }
}
