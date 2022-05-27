package barros.renata.dr.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "William"; //String constant pool
        String nome2 = "William";
        nome = nome.concat(" Suane"); // nome += " Suane"
        System.out.println(nome == nome2); //comparar referencias
        //1 variavel de referencia, 2 objeto do tipo String, 3 uma string no pool de String
        String nome3 = new String("William");
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());//pega o valor de referencia dentro do pool
    }
}
