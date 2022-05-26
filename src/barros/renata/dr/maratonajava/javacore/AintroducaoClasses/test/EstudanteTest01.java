package barros.renata.dr.maratonajava.javacore.AintroducaoClasses.test;

import barros.renata.dr.maratonajava.javacore.AintroducaoClasses.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "jackson";
        estudante.idade = 17;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
