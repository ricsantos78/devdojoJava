package barros.renata.dr.maratonajava.javacore.Npolimorfismo.servico;

import barros.renata.dr.maratonajava.javacore.Npolimorfismo.repository.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um banco de dados em memoria");
    }
}
