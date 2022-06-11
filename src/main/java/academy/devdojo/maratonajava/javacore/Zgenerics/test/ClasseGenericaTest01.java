package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.services.CarroRentavelService;
import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Carro;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro1 = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando o carro por um mes...");
        carroRentavelService.retornarCarroAlugado(carro1);
    }
}
