package academy.devdojo.maratonajava.javacore.Gexercicio.domain;

public class Professores {
    private String nome;
    private String especialidade;
    private Seminario[] seminarioProf;

    public Professores(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professores(String nome, String especialidade, Seminario[] seminarioProf) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarioProf = seminarioProf;
    }

    public void imprime() {
        System.out.println("---------------");
        System.out.println("Professor: " + this.nome);
        System.out.println("Esspecialidade: " + this.especialidade);

        if (seminarioProf == null) {
            return;
        } else {
            for (Seminario seminario : seminarioProf) {
                System.out.println("------ SeminariosCadastrados ------");
                System.out.println("Nome: " + seminario.getTitulo());
                System.out.println("Endereco " + seminario.getLocal().getEndereco());
                System.out.println("------ Alunos Cadastrados ------");
                for (Estudante estudante : seminario.getEstudanteSeminario()) {
                    System.out.println("Nome: " + estudante.getNome()+" Idade: " + estudante.getIdade());

                }


            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarioProf() {
        return seminarioProf;
    }

    public void setSeminarioProf(Seminario[] seminarioProf) {
        this.seminarioProf = seminarioProf;
    }
}
