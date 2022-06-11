package academy.devdojo.maratonajava.javacore.AintroducaoClasses.test;

import academy.devdojo.maratonajava.javacore.AintroducaoClasses.domain.Carro;

public class carroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Ford";
        carro.modelo = "Fiesta S";
        carro.ano = 2012;

        Carro carro1 = new Carro();
        carro1.nome = "VW";
        carro1.modelo = "GOL";
        carro1.ano = 2022;

        System.out.println("Nome: " + carro.nome + " - Modelo: " + carro.modelo + " - Ano: " + carro.ano);
        System.out.println("Nome: " + carro1.nome + " - Modelo: " + carro1.modelo + " - Ano: " + carro1.ano);

    }
}
