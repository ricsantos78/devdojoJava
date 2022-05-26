package barros.renata.dr.maratonajava.javacore.BintroducaoMetodos.test;

import barros.renata.dr.maratonajava.javacore.BintroducaoMetodos.domain.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();

        funcionario1.setNome("joao");
        funcionario1.setIdade(30);
        funcionario1.setSalarios(new double[]{3000, 2000, 1500});
        funcionario1.imprimirDados();
        funcionario1.somaSalario();






       // funcionario1.somaSalario(funcionario1.salarios);
    }
}
