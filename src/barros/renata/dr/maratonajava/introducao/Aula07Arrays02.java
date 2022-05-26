package barros.renata.dr.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {

        //VALORES DEFAULT.
        // byte, short , int, long, float e double iniciam em 0
        // char '\u0000'ou ' '
        //boolean false
        //string null

        String [] nomes = new String[3]; //decaralçao de array
        nomes[0] = "Joao";
        nomes[1] = "jose";
        nomes[2] = "Luffy";

        for (int i = 0 ; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }

        }

    }
