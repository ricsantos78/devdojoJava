package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest10 {
    public static void main(String[] args) {
        Stream.iterate(1, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);
        //sequencia de fibonacci

        // IMPRIMIR VALORES AGRUPADOS ex.:(0,1) (1,1) (1,2) (2,3) (3,5) (5,8)
        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0]+n[1]})
                .limit(10)
                .forEach( a -> System.out.println(Arrays.toString(a)));

        // IMPRIMIR VALORES NÃO AGRUPADOS ex.:0,1,1,2,3,5,8...
        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0]+n[1]})
                .limit(10)
                .map(n -> n[0])
                .forEach(System.out::println);

        // IMPRIMIR VALORES ALEATORIOSS
        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(() -> random.nextInt(1, 200))
                .limit(10)
                .forEach(System.out::println);
    }
}
