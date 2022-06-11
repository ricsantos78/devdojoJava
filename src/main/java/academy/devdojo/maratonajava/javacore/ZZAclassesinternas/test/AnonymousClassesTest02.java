package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Barco;

import java.util.ArrayList;
import java.util.List;

public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
        //com lambda
        barcoList.sort((o1, o2) -> o1.getNome().compareTo(o2.getNome()));

        //sem lambda
//        barcoList.sort(new Comparator<Barco>() {
//            @Override
//            public int compare(Barco o1, Barco o2) {
//                return o1.getNome().compareTo(o2.getNome());
//            }
//        });
        System.out.println(barcoList);
    }


}
