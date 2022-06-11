package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartPhoneListTest01 {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("1ABC1", "iPhone");
        Smartphone smartphone2 = new Smartphone("2222", "pixel");
        Smartphone smartphone3 = new Smartphone("3333", "Samsung");
        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(smartphone1);
        smartphones.add(smartphone2);
        smartphones.add(0,smartphone3); // muda o indice do objeto

        // smartphones.clear(); limpa tudo no arrayList

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }
        Smartphone smartphone4 = new Smartphone("2222", "pixel");
        //smartphones.contains(smartphone4); <- igual a um equals
        int indexSmartPhone4 = smartphones.indexOf(smartphone4); //pega o objeto pela posição
        System.out.println(smartphones.get(indexSmartPhone4));

    }
}
