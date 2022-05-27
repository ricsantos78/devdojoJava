package barros.renata.dr.maratonajava.exercicioPoo.exercicio01.domain;

import java.time.LocalDate;

public class Agenda {
    private int posicao;
    private Pessoa[] pessoa;

    public Agenda(int posicao, Pessoa[] pessoa) {
        this.posicao = posicao;
        this.pessoa = pessoa;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public Pessoa[] getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa[] pessoa) {
        this.pessoa = pessoa;
    }
}
