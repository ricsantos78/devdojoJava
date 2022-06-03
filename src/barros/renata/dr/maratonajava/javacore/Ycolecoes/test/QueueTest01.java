package barros.renata.dr.maratonajava.javacore.Ycolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        fila.add("C");
        fila.add("A");
        fila.add("B");
        //peek = Sempre vai mostrar o primeiro elemento
        //pool = Pega o primeiro elemento da lista e remove
        //add = adiciona porem retorna uma exceção caso seja superior a capacidade restrita
        //offer = adiciona porem retorna um boolean caso seja superior a capacidade restrita

        while (!fila.isEmpty()){
            System.out.println(fila.poll());
        }
    }
}
