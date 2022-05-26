package barros.renata.dr.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(1,0));
    }

    /**
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException caso o b seja zero
     */
    private static int divisao(int a, int b){
        if(b == 0){
            //Lançado(throw) para indicar que um método recebeu um argumento ilegal ou inapropriado.
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
            return a/b;
    }
}
