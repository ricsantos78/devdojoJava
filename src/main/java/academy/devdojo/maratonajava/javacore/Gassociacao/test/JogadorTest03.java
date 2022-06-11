package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("cafu");
        Jogador jogador1 = new Jogador("pele");
        Time time = new Time("Brasil");
        Jogador[] jogadors = {jogador,jogador1};
        jogador.setTime(time);
        jogador1.setTime(time);

        time.setJogadores(jogadors);

        System.out.println("--- Jogador ---");
        jogador.imprime();
        System.out.println("--- Jogador ---");
        jogador1.imprime();
        System.out.println("--- Time ---");
        time.imprime();
    }
}
