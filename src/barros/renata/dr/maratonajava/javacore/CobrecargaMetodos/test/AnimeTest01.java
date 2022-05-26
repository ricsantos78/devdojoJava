package barros.renata.dr.maratonajava.javacore.CobrecargaMetodos.test;

import barros.renata.dr.maratonajava.javacore.CobrecargaMetodos.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akurama Drive","TV",1,"Acao");
        anime.imprimir();
    }
}
