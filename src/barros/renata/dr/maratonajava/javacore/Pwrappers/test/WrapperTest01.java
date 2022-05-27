package barros.renata.dr.maratonajava.javacore.Pwrappers.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        //Tipos Primitivos, tem preferencia quando trabalhamos com classses.
        byte byteP = 1;
        short shortP=1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;


        //Classes Wrappers
        Byte byteW = 1;
        Short shortW=1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;


        int i = intW; //Unboxing
        Integer intW2 = Integer.parseInt("1");//Transforma string em Integer
        boolean aTrue = Boolean.parseBoolean("true");
        //System.out.println(aTrue);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));


    }
}
