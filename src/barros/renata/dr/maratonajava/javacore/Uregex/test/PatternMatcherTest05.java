package barros.renata.dr.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    // william.suane@devdojo.academy
    public static void main(String[] args) {
        // \d = retorna todos os digitoss
        // \D = retorna tudo que nao for digito
        // \s = retorna todos os espaços em brancos \t \n \f \r
        // \S = retorna todos os caracteres excluindo espaçoes em branco
        // \w = Retorna tudo que for a-z A-Z, digitos e _
        // \W = Retorna tudo que não for a-z A-Z, digitos e _
        // []
        // ? zero ou uma ocorrecia
        // * zero ou mais
        // + uma ou mais
        // {} de n ate m..
        // () agrupamento
        // | "ou"
        // $ fim da linha
        // . ex 1.3 = 123, 133, 1@3, 1A3


        //String regex = "[abcABC]";
        //String regex = "[a-zA-C]";
        String regex = "([a-zA-Z\\d\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br," +
                "teste@gmail.com, teste@gmail.com.br, sakura@mail";
        System.out.println("Email valido");
        System.out.println("#@!zoro@mail.br".matches(regex));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  "+texto);
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
