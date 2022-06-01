package barros.renata.dr.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {

    public static void main(String[] args) {

        File f = new File("file.txt");

        try (FileReader fr = new FileReader(f)) {
            // System.out.println(fr.read());

// LER UMA PARTE DO ARQUIVO
//            char[] in = new char[30];
//            fr.read(in);
//            for (char c : in) {
//                System.out.print(c);

            // LER O ARQUIVO TODO
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
