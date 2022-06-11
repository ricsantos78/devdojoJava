package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int [][] arraysNum = new int[3][];


        //nova inicialização de arrays
        arraysNum[0] = new int[3];
        arraysNum[1] = new int[5];
        arraysNum[2] = new int[1];

        for (int[] arrayBase : arraysNum){
            System.out.println("\n------------");
            for (int num : arrayBase){
                System.out.print(num + " ");

            }
        }
    }
}
