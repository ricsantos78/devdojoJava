package barros.renata.dr.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        // generics <String> por exemplo.
        List<String> lista = new ArrayList();
        lista.add("Midoriya");
        lista.add("Legolas");

        for (String s : lista) {
            System.out.println(s);
        }

    }
}
