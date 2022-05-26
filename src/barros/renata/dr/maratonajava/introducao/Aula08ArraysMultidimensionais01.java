package barros.renata.dr.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {

    public static void main(String[] args) {
        //meses
        //dias
        int[][]dias = new int[3][3];

        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 30;

        //for normal
        for (int i = 0; i < dias.length; i++){
            for (int j = 0; j < dias[i].length;j++){
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("--------------------");

        //forEach
        for (int[] numArrBase : dias){
            for (int num : numArrBase){
                System.out.println(num);
            }
        }
    }


}
