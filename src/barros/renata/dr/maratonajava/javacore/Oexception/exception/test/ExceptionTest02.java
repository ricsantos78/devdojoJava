package barros.renata.dr.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02  {
    public static void main(String[] args) throws IOException {
        //Checked
        criarArquivo();
    }

    private static void criarArquivo() throws IOException{
        File file = new File("Arquivo\\testes.txt");
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo Criado "+isCriado);

    }
}
