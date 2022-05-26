package barros.renata.dr.maratonajava.javacore.Npolimorfismo.test;

import barros.renata.dr.maratonajava.javacore.Npolimorfismo.repository.Repositorio;
import barros.renata.dr.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import barros.renata.dr.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import barros.renata.dr.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();

        List<String> list = new LinkedList<>();
        list.add("goku");
        list.add("vegeta");
        list.add("kuririn");

        System.out.println(list);
    }
}
