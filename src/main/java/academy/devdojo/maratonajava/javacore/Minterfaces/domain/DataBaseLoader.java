package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public class DataBaseLoader implements DataLoader,DataRemover {

    // private -> default -> protected -> public
    @Override
    public void load() {
        System.out.println("caregando dadoss do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("removendo do banco de dados");
    }
}
