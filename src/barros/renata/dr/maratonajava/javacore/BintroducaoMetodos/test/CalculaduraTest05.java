package barros.renata.dr.maratonajava.javacore.BintroducaoMetodos.test;

import barros.renata.dr.maratonajava.javacore.BintroducaoMetodos.domain.Calculadora;

public class CalculaduraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somaArray(numeros);
        calculadora.somaVarargs(1, 2, 3, 4, 5, 7, 8, 6, 3);

    }
}
