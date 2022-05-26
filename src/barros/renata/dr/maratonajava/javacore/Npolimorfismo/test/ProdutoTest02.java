package barros.renata.dr.maratonajava.javacore.Npolimorfismo.test;

import barros.renata.dr.maratonajava.javacore.Npolimorfismo.domain.Computador;
import barros.renata.dr.maratonajava.javacore.Npolimorfismo.domain.Produto;
import barros.renata.dr.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 5000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("----------");
        Produto produto2 = new Tomate("Tomate Americano", 30);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());

    }

}
