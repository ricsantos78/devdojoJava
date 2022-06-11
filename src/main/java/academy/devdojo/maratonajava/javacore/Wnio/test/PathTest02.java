package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

//Se o files.createdDirectory chamado ja existir, ele lança uma exceção
// Se o files.createdDirectories chamado ja existir, ele não lança uma exceção

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("pasta");//equivalente a new file("pasta")

        //CRIAR PASTA OU SUBPASTAS
        if(Files.notExists(pastaPath)){
            Path pastaDirectory = Files.createDirectory(pastaPath);
        }
        Path subPastaPath = Paths.get("pasta/subpasta/subpasta");
        Path subPastaDirectory = Files.createDirectories(subPastaPath);

        //CRIAR UM ARQUIVO
        Path filePath = Paths.get(subPastaPath.toString(), "file.txt");
        if(Files.notExists(filePath)){
            Path filePathCreated = Files.createFile(filePath);
        }

        //RENOMEANDO ARQUIVO
        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

    }
}
