package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "     Luffy    ";
        String numeros = "012345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());//saber o tamanho
        System.out.println(nome.replace("f", "l"));//troca uma letra por outra letra
        System.out.println(nome.toLowerCase());// troca tudo por LowerCase
        System.out.println(nome.toUpperCase());// troca tudo por UpperCase
        System.out.println(numeros.length()); // tamanho
        System.out.println(numeros.substring(0,2));//valor final menos 1
        System.out.println(numeros.substring(3)); //ambos abaixo tem o mesmo resultado
        System.out.println(numeros.substring(3,numeros.length()));// não precisa chamar o length
        System.out.println(nome.trim());//Remove valor em brancos no começo ou fim.

    }
}
