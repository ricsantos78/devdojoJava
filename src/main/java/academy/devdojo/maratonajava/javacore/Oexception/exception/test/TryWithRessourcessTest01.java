package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.Leitor1;
import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.Leitor2;

import java.io.*;

public class TryWithRessourcessTest01 {
    public static void main(String[] args) {
        lerArquivo3();
    }
    public static void lerArquivo3(){
        /*
        * O Try ele abre na ordem que esta passando
        * porem fecha na ordem inversa
        * ex: ele abre leitor1 e leitor2
        * e fecha leitor2 e leitor1
        */
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()) {

        }catch (IOException e){

        }
    }

    public static void lerArquivo(){
        /**
         *Java vai se encarregar de feixar sem precisar chamar o metodo close do tipo reader.
         */
        try (Reader reader = new BufferedReader(new FileReader("teste.txt"))){

        }catch (IOException e){

        }
    }

    public static void lerArquivo2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                assert reader != null;
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
