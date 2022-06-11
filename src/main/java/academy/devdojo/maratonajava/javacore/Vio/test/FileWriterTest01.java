package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//file
//fileWriter
//fileReader
//bufferedWriter
//bufferedReader
public class FileWriterTest01 {


    public static void main(String[] args) {
        File file =new File("file.txt");

        try(FileWriter fw = new FileWriter(file)) {
            fw.write("O devDojo melhor curso do brasil.. \n ooooo melhooooooor");
            fw.flush(); // elimina todo o buffer o proprio fileWrite se encarregará de fechar
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
