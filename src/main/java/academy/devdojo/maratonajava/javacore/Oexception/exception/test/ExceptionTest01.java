package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        //Checked
        criarArquivo();
    }

    private static void criarArquivo(){
        File file = new File("Arquivo\\testes.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo Criado "+isCriado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
