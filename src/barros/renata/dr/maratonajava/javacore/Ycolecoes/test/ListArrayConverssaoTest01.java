package barros.renata.dr.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConverssaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        //Consegue de um ArrayList pegar o valor de um Array
        Integer[] litToArray = numeros.toArray(numeros.toArray(new Integer[0]));
        System.out.println(Arrays.toString(litToArray));

        System.out.println("-------------------");

        //
        Integer[] numerossArray = new Integer[3];
        numerossArray[0] = 1;
        numerossArray[1] = 2;
        numerossArray[2] = 3;

        List<Integer> arrayToList = Arrays.asList(numerossArray);
        arrayToList.set(0,12);
        System.out.println(Arrays.toString(numerossArray));
        System.out.println(arrayToList);

        System.out.println("-------------------");
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerossArray));
        numerosList.add(15);
        System.out.println(numerosList);
        


    }
}
