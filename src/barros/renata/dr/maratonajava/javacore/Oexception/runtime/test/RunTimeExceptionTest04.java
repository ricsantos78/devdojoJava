package barros.renata.dr.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
        try {

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("dentro do ArrayIndexOutOfBoundsException ");
        }catch (IndexOutOfBoundsException e){
            System.out.println("dentro do IndexOutOfBoundsException");
        }catch (IllegalArgumentException e){
            System.out.println("dentro do IllegalArgumentException");
        }
    }

}
