package barros.renata.dr.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
        public static void main(String[] args) {
            File file =new File("file.txt");

            try(FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw)) {
                bw.write("O devDojo melhor curso do brasil.. ooooo melhooooooor");
                bw.newLine(); // separador de linha
                bw.flush(); // elimina todo o buffer o proprio fileWrite se encarregará de fechar
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

