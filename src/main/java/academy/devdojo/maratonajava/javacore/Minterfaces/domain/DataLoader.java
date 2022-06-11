package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {
    //todos os atributos são public static final
    int MAX_DATA_SIZE = 10;

    //todos os construtores são public abstrato
    void load();
    default void checkPermission(){
        System.out.println("checkando Permissao");
    }

    //metodos staticos nunca vao ser sobrescritos
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize");
    }
}
