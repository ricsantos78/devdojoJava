package barros.renata.dr.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);
        //caso nao encontre (-(ponto de inserçao) -1)

        Collections.sort(numeros);
        System.out.println(Collections.binarySearch(numeros,2));
    }
}
