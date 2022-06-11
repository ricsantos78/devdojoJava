package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//1 . Order lightNovel by title
//2 . Retrieve the first 3 title light novels with price less than 4
public class StreamTest02 {
    private static final List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life ", 2.99),
            new LightNovel("Fullmetal alchemist", 5.99),
            new LightNovel("Kumo Desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {
        List<String> titles = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))//Ordenar
                .filter(lightNovel -> lightNovel.getPrice() <= 4)//Filtrar
                .limit(3)//limitar
                .map(LightNovel::getTitle)//retorna o getTittle
                .collect(Collectors.toList());//Final

        System.out.println(titles);
    }
}
