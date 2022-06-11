package academy.devdojo.maratonajava.exercicioPoo.exercicio01.service;

import academy.devdojo.maratonajava.exercicioPoo.exercicio01.domain.Pessoa;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PessoaService {
    public static void imprimir(Pessoa pessoa){
        System.out.println("Nome: "+ pessoa.getNome());
        System.out.println("Data Nascimento: "+ pessoa.getDataNascimento());
        System.out.println("Altura: "+ pessoa.getAltura());

    }
    public static void calcularIdadePessoa(Pessoa pessoa){
        LocalDate now = LocalDate.now();
        System.out.println("Idade: "+ ChronoUnit.YEARS.between(pessoa.getDataNascimento(), now)+" Anos");


    }
}
