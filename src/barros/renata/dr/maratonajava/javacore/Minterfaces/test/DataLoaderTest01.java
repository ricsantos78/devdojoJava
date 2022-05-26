package barros.renata.dr.maratonajava.javacore.Minterfaces.test;

import barros.renata.dr.maratonajava.javacore.Minterfaces.domain.DataBaseLoader;
import barros.renata.dr.maratonajava.javacore.Minterfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.load();
        dataBaseLoader.remove();
        dataBaseLoader.checkPermission();

        fileLoader.load();
        fileLoader.remove();
        dataBaseLoader.checkPermission();
    }
}
