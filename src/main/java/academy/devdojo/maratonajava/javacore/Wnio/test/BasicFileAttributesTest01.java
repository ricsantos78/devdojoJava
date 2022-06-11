package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        //BasicFileAttributes = não quer se preocupar pra onde vai o deploy,
        // DosFileAttributes = deploy windows,
        // PosixFileAttributes = deploy linux

        //alterando data do arquivo modo antigo
        LocalDateTime ldt = LocalDateTime.now().minusDays(10);
        File file = new File("pasta2/novo.txt");
        boolean isCreated = file.createNewFile();
        boolean isModified = file.setLastModified(ldt.toInstant(ZoneOffset.UTC).toEpochMilli());

        //Ultilizando pacote New IO
        Path path = Paths.get("pasta2/novo_path.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.from(ldt.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path,fileTime);

    }
}
