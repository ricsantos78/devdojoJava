package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.services.BarcoRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco1 = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando o barco por um mes...");
        barcoRentavelService.retornarBarcoAlugado(barco1);
    }
}
