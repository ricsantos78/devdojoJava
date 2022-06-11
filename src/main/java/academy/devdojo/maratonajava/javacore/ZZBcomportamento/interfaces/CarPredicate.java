package academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.domain.Car;

@FunctionalInterface
public interface CarPredicate {
    //PREDICATE = RECEBE UM TIPO QUALQUER E RETORNA UM BOOLEAN
    //anonimas, funções, conciso
    boolean test(Car car);
    //Lambda
    //(parametro) -> expressão = retorna um boolean
    //ex (Car car) -> car.getColor().equals("green");
}
