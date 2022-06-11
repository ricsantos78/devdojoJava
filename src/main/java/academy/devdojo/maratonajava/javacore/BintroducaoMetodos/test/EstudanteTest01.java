package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.test;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.domain.Estudante;
import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.domain.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();



        estudante1.nome = "Ric";
        estudante1.idade = 15;
        estudante1.sexo = 'M';

        estudante2.nome = "Sakura";
        estudante2.idade = 16;
        estudante2.sexo = 'F';

        impressoraEstudante.imprime(estudante1);
        impressoraEstudante.imprime(estudante2);
        impressoraEstudante.imprime(estudante1);
        impressoraEstudante.imprime(estudante2);

    }
}
