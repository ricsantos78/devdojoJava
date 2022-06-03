package barros.renata.dr.maratonajava.javacore.Zgenerics.test;

import barros.renata.dr.maratonajava.javacore.Zgenerics.domain.Carro;
import barros.renata.dr.maratonajava.javacore.Zgenerics.services.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro1 = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando o carro por um mes...");
        carroRentavelService.retornarCarroAlugado(carro1);
    }
}
