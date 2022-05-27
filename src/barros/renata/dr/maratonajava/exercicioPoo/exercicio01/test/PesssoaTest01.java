package barros.renata.dr.maratonajava.exercicioPoo.exercicio01.test;

import barros.renata.dr.maratonajava.exercicioPoo.exercicio01.domain.Pessoa;
import barros.renata.dr.maratonajava.exercicioPoo.exercicio01.service.PessoaService;

import java.time.LocalDate;

public class PesssoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Jose Ricardo", LocalDate.of(1991,05,30), 1.92);
        PessoaService.imprimir(pessoa);
        PessoaService.calcularIdadePessoa(pessoa);


    }
}
