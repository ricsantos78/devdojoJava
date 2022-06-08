package barros.renata.dr.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devDojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Wildnei Suane", "Catarina Santos", "Sandy Catarina");
        List<String> developer = List.of("Ricardo Santos", "William", "David");
        List<String> students = List.of("Edipo", "Gustavo Lima", "Gustavo Mendes", "Guilherme");
        devDojo.add(students);
        devDojo.add(graphicDesigners);
        devDojo.add(developer);

        //flatMap usado quando voce tem valores aninhados.
        devDojo.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);
    }
}
