package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> strings = List.of("Ricardo", "Santos", "Luffy", "Zoro");
        forEach(strings, (String s)  -> System.out.println(s));
        System.out.println("------------------------");
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        forEach(integers, (Integer i) -> System.out.println(i));

    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }

    }
}
