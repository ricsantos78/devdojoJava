package barros.renata.dr.maratonajava.javacore.BintroducaoMetodos.domain;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double somaS;

    public void imprimirDados(){
        System.out.println("----------------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        if(salarios == null){
            return;
        }else {
            for (double salario : salarios) {
                System.out.println(salario + " ");
            }
        }

    }

    public void somaSalario() {
        if (salarios == null){
            return;
        }else {
            for(double salario : salarios){
                somaS += salario;
            }
            somaS/= salarios.length;
            System.out.println("----------------------");
            System.out.println(somaS);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getSomaS() {
        return somaS;
    }
}
