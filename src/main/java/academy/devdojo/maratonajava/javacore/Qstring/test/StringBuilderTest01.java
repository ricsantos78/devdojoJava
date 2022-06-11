package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "William Suane";
        nome.concat(" DevDojo");
        nome.substring(0,3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("William Suane"); //StringBuilder nao é imutavel
        sb.append(" devDojo");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);

    }
}
