package barros.renata.dr.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {


        abreConexao();
    }

    private static void abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            throw new RuntimeException();
            //System.out.println("Escrevendo dados no arquivo");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //finally é um bloco de codigo que sempre vai ser executado
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}
