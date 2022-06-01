package barros.renata.dr.maratonajava.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        //BasicFileAttributesView = não quer se preocupar pra onde vai o deploy,
        // DosFileAttributesView = deploy windows,
        // PosixFileAttributesView = deploy linux

        //Ultilizando pacote New IO
        Path path = Paths.get("pasta2/new.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);//<- chama o metodo atravez da interfaçe
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();

        System.out.println("creationTime "+creationTime);
        System.out.println("lastModifiedTime "+lastModifiedTime);
        System.out.println("lastAccessTime "+lastAccessTime);
        System.out.println("--------------------------------");

        //Alteraçoes usamos as classes "VIEW"
        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());//<- pegando o tempo e milisegundos do SO
        fileAttributeView.setTimes(lastModifiedTime,newCreationTime,creationTime);

        //ALTERAÇAO.
         creationTime = fileAttributeView.readAttributes().creationTime();
         lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
         lastAccessTime = fileAttributeView.readAttributes().lastAccessTime();

        System.out.println("creationTime "+creationTime);
        System.out.println("lastModifiedTime "+lastModifiedTime);
        System.out.println("lastAccessTime "+lastAccessTime);
        System.out.println("--------------------------------");
    }
}
