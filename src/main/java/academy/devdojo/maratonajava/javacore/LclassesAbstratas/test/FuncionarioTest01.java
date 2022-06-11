package academy.devdojo.maratonajava.javacore.LclassesAbstratas.test;

import academy.devdojo.maratonajava.javacore.LclassesAbstratas.domain.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.LclassesAbstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 12000);
        System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 8000);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
