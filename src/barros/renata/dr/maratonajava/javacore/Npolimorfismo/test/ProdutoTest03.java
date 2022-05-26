package barros.renata.dr.maratonajava.javacore.Npolimorfismo.test;

import barros.renata.dr.maratonajava.javacore.Npolimorfismo.domain.Computador;
import barros.renata.dr.maratonajava.javacore.Npolimorfismo.domain.Produto;
import barros.renata.dr.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import barros.renata.dr.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Tomate tomate = new Tomate("Tomate Americano", 30);
        Produto produto = new Computador("Ryzen 9", 5000);
        tomate.setDataValidade("30/05/2022");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
