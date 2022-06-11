package academy.devdojo.maratonajava.javacore.Zgenerics.services;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcoDisponivel =
            new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

    public Barco buscarBarcoDisponivel(){
        System.out.println("Buscando Barco disponivel....");
        Barco barco = barcoDisponivel.remove(0);
        System.out.println("Alugando Barco: "+barco);
        System.out.println("Barcos disponiveis para alugar:");
        System.out.println(barcoDisponivel);
        return barco;
    }

    public void retornarBarcoAlugado(Barco barco){
        System.out.println("Devolvendo Barco "+barco);
        barcoDisponivel.add(barco);
        System.out.println("Barcos disponiveis para alugar: ");
        System.out.println(barcoDisponivel);
    }
}
