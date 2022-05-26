package barros.renata.dr.maratonajava.javacore.LclassesAbstratas.domain;

public class Desenvolvedor extends Funcionario
{
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void bonusSalario() {
        this.salario += salario * 0.05;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }


}
