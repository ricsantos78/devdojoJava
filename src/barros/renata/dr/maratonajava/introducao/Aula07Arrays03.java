package barros.renata.dr.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {

        //tipos de declaração de array
        int[] numeros = new int[3];

        int[] numeros2 = {1,2,3,4,5};

        int[] numeros3 = new int[]{1,2,3,4,5};

        //tipos de for
        for (int i = 0 ; i <numeros.length; i++ ){
            System.out.println(numeros[i]);
        }

        for(int num: numeros3){
            System.out.println(num);
        }
    }
}
