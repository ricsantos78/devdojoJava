package barros.renata.dr.maratonajava.javacore.AintroducaoClasses.test;

import barros.renata.dr.maratonajava.javacore.AintroducaoClasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Kami";
        professor.idade = 60;
        professor.sexo = 'M';

        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
    }
}
