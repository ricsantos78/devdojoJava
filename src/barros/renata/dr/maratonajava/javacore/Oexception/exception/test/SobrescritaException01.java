package barros.renata.dr.maratonajava.javacore.Oexception.exception.test;

import barros.renata.dr.maratonajava.javacore.Oexception.exception.domain.Funcionario;
import barros.renata.dr.maratonajava.javacore.Oexception.exception.domain.LoginIvalidoException;
import barros.renata.dr.maratonajava.javacore.Oexception.exception.domain.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaException01 {
    public static void main(String[] args) throws LoginIvalidoException {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            pessoa.salvar();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            funcionario.salvar();
        } catch (LoginIvalidoException e) {
            throw new RuntimeException(e);
        }
    }
}
