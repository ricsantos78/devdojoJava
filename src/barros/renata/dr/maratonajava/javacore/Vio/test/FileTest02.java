package barros.renata.dr.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        //criar diretorio
        File fileDiretorio = new File("pasta");
        boolean mkdir = fileDiretorio.mkdir();
        System.out.println(mkdir);

        //criar arquivo dentro do diretorio
        File arquivoDiretorio = new File(fileDiretorio, "arquivo.txt");
        boolean isFileCreated = arquivoDiretorio.createNewFile();
        System.out.println(isFileCreated);

        //renomear arquivo dentro do diretorio
        File fileRenamed = new File(fileDiretorio,"arquivo_renomeado");
        boolean isRenamed = arquivoDiretorio.renameTo(fileRenamed);
        System.out.println(isRenamed);

        //renomear diretorio
        File diretorioRenamed = new File("pasta2");
        boolean isDiretorioRenomeado = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println(isDiretorioRenomeado);
    }
}
