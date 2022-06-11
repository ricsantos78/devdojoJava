package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.domain.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person build = Person.PersonBuilder
                .aPerson()
                .firstName("ricardo")
                .lastName("santos")
                .username("ricsantos")
                .email("ricsantos@test.com")
                .build();

        System.out.println(build);
    }
}
