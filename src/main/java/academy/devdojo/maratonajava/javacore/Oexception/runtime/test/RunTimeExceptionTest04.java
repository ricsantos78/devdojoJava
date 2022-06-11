package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
        try {
                throw new ArithmeticException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("dentro do ArrayIndexOutOfBoundsException ");
        }catch (IndexOutOfBoundsException e){
            System.out.println("dentro do IndexOutOfBoundsException");
        }catch (IllegalArgumentException e){
            System.out.println("dentro do IllegalArgumentException");
        }catch (ArithmeticException e){
            System.out.println("dentro do ArithmeticException");
        }catch (RuntimeException e){
            //exceções mais genericas tem que ser inicializado no final
            System.out.println("Dentro da RuntimeException");
        }
        try {
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e) {
            /**
             * não pode fazer UM OU("|") no catch se as duas classes
             * for da mesma linha de herança
             */
            throw new RuntimeException(e);
        }
    }

    public static void talvezLanceException() throws SQLException, FileNotFoundException{

    }
}
