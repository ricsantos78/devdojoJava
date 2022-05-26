package barros.renata.dr.maratonajava.javacore.BintroducaoMetodos.test;

import barros.renata.dr.maratonajava.javacore.BintroducaoMetodos.domain.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.dividirDoisNumeros(20,10);
        System.out.println(result);
    }
}
