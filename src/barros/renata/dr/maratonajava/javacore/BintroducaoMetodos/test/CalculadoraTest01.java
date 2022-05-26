package barros.renata.dr.maratonajava.javacore.BintroducaoMetodos.test;

import barros.renata.dr.maratonajava.javacore.BintroducaoMetodos.domain.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("fim");
        calculadora.subtrairDoisNumeros();
    }
}
