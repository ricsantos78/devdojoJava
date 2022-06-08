package barros.renata.dr.maratonajava.javacore.ZZEstreams.test;

import barros.renata.dr.maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
    private static final List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 10.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life ", 2.99),
            new LightNovel("Fullmetal alchemist", 5.99),
            new LightNovel("Kumo Desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {
        System.out.println(lightNovels.stream()
                .anyMatch(ln -> ln.getPrice() > 9));//SE TEM ALGUM ELEMENTO COM O PRECO MAIOR QUE 9.
        System.out.println(lightNovels.stream()
                .allMatch(ln -> ln.getPrice() > 0));//SE TODOS OS ELEMENTO SAO MAIOR QUE 0
        System.out.println(lightNovels.stream()
                .noneMatch(ln -> ln.getPrice() < 0));//NENHUM ELEMENTO E MENOR QUE 0

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .findAny()//RETORNA QUALQUER RESULTADO DA EXPRESSAO DO FILTER.
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);
        //max substitui o sorted + findFirst, ele compara e pega o primeiro elemento

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice).reversed())
                .findFirst()
                .ifPresent(System.out::println);
    }
}
