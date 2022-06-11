package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    // william.suane@devdojo.academy
    public static void main(String[] args) {
        // \d = retorna todos os digitoss
        // \D = retorna tudo que nao for digito
        // \s = retorna todos os espaços em brancos \t \n \f \r
        // \S = retorna todos os caracteres excluindo espaçoes em branco
        // \w = Retorna tudo que for a-z A-Z, digitos e _
        // \W = Retorna tudo que não for a-z A-Z, digitos e _
        // []
        //String regex = "[abcABC]";
        //String regex = "[a-zA-C]";
        String regex = "0[xX][0-9a-fA-F]";
        String texto = "abaaba";
        String texto2 = "12 0x 0X 0xFFABC 0x109 0x1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  "+texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+ " "+matcher.group()+"\n");
        }
        int numeroHex = 0x1;
        System.out.println(numeroHex);
    }

}
