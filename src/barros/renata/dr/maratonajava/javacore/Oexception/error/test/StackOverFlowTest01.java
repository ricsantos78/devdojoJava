package barros.renata.dr.maratonajava.javacore.Oexception.error.test;

public class StackOverFlowTest01 {
    public static void main(String[] args) {
        recursividade();
    }
    public static void recursividade(){
        recursividade();
    }
}
