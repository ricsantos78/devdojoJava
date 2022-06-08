package barros.renata.dr.maratonajava.javacore.ZZDoptional.test;

import barros.renata.dr.maratonajava.javacore.ZZDoptional.domain.Manga;
import barros.renata.dr.maratonajava.javacore.ZZDoptional.repository.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Boku no Hero");
        mangaByTitle.ifPresent(manga -> manga.setTitle(manga.getTitle()+" "+2));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepository.findById(2).orElseThrow(IllegalArgumentException::new);

        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTitle("DBZ")
                .orElseGet(() -> new Manga(3, "DBZ", 300));
        System.out.println(newManga);

    }
}
