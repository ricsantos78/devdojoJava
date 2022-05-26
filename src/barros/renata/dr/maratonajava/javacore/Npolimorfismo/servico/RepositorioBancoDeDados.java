package barros.renata.dr.maratonajava.javacore.Npolimorfismo.servico;

import barros.renata.dr.maratonajava.javacore.Npolimorfismo.repository.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    public void salvar() {
        System.out.println("Salvando em um banco de dados");
    }
}
