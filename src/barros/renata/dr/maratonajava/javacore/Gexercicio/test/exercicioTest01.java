package barros.renata.dr.maratonajava.javacore.Gexercicio.test;

import barros.renata.dr.maratonajava.javacore.Gexercicio.domain.Estudante;
import barros.renata.dr.maratonajava.javacore.Gexercicio.domain.Local;
import barros.renata.dr.maratonajava.javacore.Gexercicio.domain.Professores;
import barros.renata.dr.maratonajava.javacore.Gexercicio.domain.Seminario;

public class exercicioTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua gevarzio pires");
        Local local1 = new Local("AV RIO BRANCO");

        Professores professores = new Professores("Ricardo", "Portugues");
        Professores professores1 = new Professores("Joao", "Matematica");

        Estudante estudante = new Estudante("Jose Ricardo", 30);
        Estudante estudante1 = new Estudante("Maria Eduarda", 30);
        Estudante[] alunosParaSemi = {estudante};

        Seminario seminario = new Seminario("Jogos Olimpicos", alunosParaSemi, local);
        Seminario[] seminariosProf = {seminario};
        professores.setSeminarioProf(seminariosProf);

        professores.imprime();


    }
}
