package barros.renata.dr.maratonajava.javacore.Gexercicio.domain;

public class Seminario {
    private String titulo;
    private Estudante[] estudanteSeminario;
    private Local local;

    public void imprimir(){
        this.titulo = titulo;
        this.local = local;
        if (estudanteSeminario != null){
            for (Estudante estudante : estudanteSeminario){
                System.out.println(estudante.getNome());
            }
        }
    }

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Estudante[] estudanteSeminario, Local local) {
        this.titulo = titulo;
        this.estudanteSeminario = estudanteSeminario;
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Estudante[] getEstudanteSeminario() {
        return estudanteSeminario;
    }

    public void setEstudanteSeminario(Estudante[] estudanteSeminario) {
        this.estudanteSeminario = estudanteSeminario;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
