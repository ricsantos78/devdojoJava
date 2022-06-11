package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: "+produto.getNome());
        System.out.println("Preco: "+produto.getValor());
        System.out.println("Imposto a ser pago: "+produto.calcularImposto());
        //se o produto for instacia de um tomate
        if(produto instanceof Tomate){
            //Casting
            System.out.println("Validade: "+((Tomate) produto).getDataValidade());
        }
    }
}
