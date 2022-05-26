package barros.renata.dr.maratonajava.javacore.Npolimorfismo.test;

import barros.renata.dr.maratonajava.javacore.Npolimorfismo.domain.Computador;
import barros.renata.dr.maratonajava.javacore.Npolimorfismo.domain.Televisao;
import barros.renata.dr.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import barros.renata.dr.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador(" NUC10I7", 11000);
        Tomate tomate = new Tomate(" Tomate Siciliano",  10);
        Televisao tv = new Televisao("Samsung 50\" ",5000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
