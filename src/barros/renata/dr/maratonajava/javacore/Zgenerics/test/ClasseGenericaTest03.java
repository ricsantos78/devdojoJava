package barros.renata.dr.maratonajava.javacore.Zgenerics.test;

import barros.renata.dr.maratonajava.javacore.Zgenerics.domain.Barco;
import barros.renata.dr.maratonajava.javacore.Zgenerics.domain.Carro;
import barros.renata.dr.maratonajava.javacore.Zgenerics.services.BarcoRentavelService;
import barros.renata.dr.maratonajava.javacore.Zgenerics.services.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis =
                new ArrayList<>(List.of(new Carro("Honda"), new Carro("Fusca")));

        List<Barco> barcoDisponivel =
                new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalService.buscarObjetoDisponivel();
        System.out.println("Usando o carro por um mes...");
        rentalService.retornarObjetoAlugado(carro);
        System.out.println("----------------");

        RentalService<Barco> rentalService1 = new RentalService<>(barcoDisponivel);
        Barco barco = rentalService1.buscarObjetoDisponivel();
        System.out.println("Usando o barco por um mes...");
        rentalService1.retornarObjetoAlugado(barco);
    }
}
