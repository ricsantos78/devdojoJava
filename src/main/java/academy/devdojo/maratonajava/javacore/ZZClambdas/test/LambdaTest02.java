package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    //Function tipo T é o que vai receber e o R é o que vai retornar
    public static void main(String[] args) {
        List<String> strings = List.of("Natsu", "Allucard");
        List<Integer> integers = map(strings, (String s) -> s.length());
        List<Integer> integersMethodReference = map(strings, String::length);
        List<String> strings1 = map(strings, s -> s.toUpperCase());
        List<String> strings2MethodReference = map(strings, String::toUpperCase);
        System.out.println(integers);
        System.out.println(strings1);

    }

    //map = quando voce tem que transformar uma coisa e retornar algo completamente diferente
    //chamaos de map
    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            R r = function.apply(t);
            result.add(r);
        }
        return result;
    }
}
