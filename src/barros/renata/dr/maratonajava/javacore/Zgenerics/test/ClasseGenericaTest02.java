package barros.renata.dr.maratonajava.javacore.Zgenerics.test;

import barros.renata.dr.maratonajava.javacore.Zgenerics.domain.Barco;
import barros.renata.dr.maratonajava.javacore.Zgenerics.domain.Carro;
import barros.renata.dr.maratonajava.javacore.Zgenerics.services.BarcoRentavelService;
import barros.renata.dr.maratonajava.javacore.Zgenerics.services.CarroRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco1 = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando o barco por um mes...");
        barcoRentavelService.retornarBarcoAlugado(barco1);
    }
}
