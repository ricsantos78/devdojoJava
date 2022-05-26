package barros.renata.dr.maratonajava.javacore.Npolimorfismo.servico;

import barros.renata.dr.maratonajava.javacore.Npolimorfismo.repository.Repositorio;

public class RepositorioArquivo implements Repositorio {
    public void salvar() {
        System.out.println("Salvando em um Arquivo");
    }
}
