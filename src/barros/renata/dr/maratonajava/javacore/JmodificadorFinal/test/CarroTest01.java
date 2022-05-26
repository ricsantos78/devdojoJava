package barros.renata.dr.maratonajava.javacore.JmodificadorFinal.test;

import barros.renata.dr.maratonajava.javacore.JmodificadorFinal.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        carro.COMPRADOR.setNome("Ricardo");
        System.out.println(carro.COMPRADOR);
    }
}
