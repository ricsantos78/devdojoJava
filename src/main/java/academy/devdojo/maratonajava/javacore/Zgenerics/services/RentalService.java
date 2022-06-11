package academy.devdojo.maratonajava.javacore.Zgenerics.services;

import java.util.List;

//Quando usamos o T, informa a lista que Qualquer objeto pode ser usado no service.
public class RentalService<T> {
    private List<T> objetosDisponiveis;
    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetoDisponivel(){
        System.out.println("Buscando objeto disponivel....");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando objeto: "+t);
        System.out.println("Objetos disponiveis para alugar:");
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void retornarObjetoAlugado(T t){
        System.out.println("Devolvendo objeto "+t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponiveis para alugar: ");
        System.out.println(objetosDisponiveis);
    }
}