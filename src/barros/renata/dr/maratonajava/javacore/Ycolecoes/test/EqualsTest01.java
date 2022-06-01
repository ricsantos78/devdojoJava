package barros.renata.dr.maratonajava.javacore.Ycolecoes.test;

import barros.renata.dr.maratonajava.javacore.Ycolecoes.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("1ABC1", "iPhone");
        Smartphone smartphon2 = new Smartphone("1ABC1", "iPhone");

        System.out.println(smartphone.equals(smartphon2));
    }
}
