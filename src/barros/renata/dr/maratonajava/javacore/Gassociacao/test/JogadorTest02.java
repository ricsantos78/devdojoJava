package barros.renata.dr.maratonajava.javacore.Gassociacao.test;

import barros.renata.dr.maratonajava.javacore.Gassociacao.domain.Jogador;
import barros.renata.dr.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Time time = new Time("Selecao Brasileira");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
