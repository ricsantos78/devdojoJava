package barros.renata.dr.maratonajava.javacore.BintroducaoMetodos.test;

import barros.renata.dr.maratonajava.javacore.BintroducaoMetodos.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jiraia");
        pessoa.setIdade(-1);
        pessoa.imprime();
    }
}
