package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Pessoa;

public class TesteHeranca01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("50000-000");
        Pessoa pessoa = new Pessoa("Ricardo");
        pessoa.setCpf("000.000.000-00");
        pessoa.setEndereco(endereco);
        pessoa.imprimir();

        Funcionario funcionario = new Funcionario("Jose Mario");
        funcionario.setCpf("055.777.888-99");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000);
        System.out.println("--------------");
        funcionario.imprimir();
    }
}
