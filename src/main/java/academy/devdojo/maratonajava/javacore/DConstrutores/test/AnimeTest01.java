package academy.devdojo.maratonajava.javacore.DConstrutores.test;

import academy.devdojo.maratonajava.javacore.DConstrutores.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV", 1,"acao");
        Anime anime1 = new Anime();
        anime1.imprimir();
        anime.imprimir();
    }
}
