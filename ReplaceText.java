import java.io.*;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReplaceText {

    public static void replace(String sourceFile, String targetFile, String oldString, String newString) throws FileSystemException, IOException {

        long start = System.nanoTime();

        try {

            Files.write(Paths.get(targetFile), new String(Files.readAllBytes(Paths.get(sourceFile))).replaceAll(oldString, newString).getBytes());

        } catch (Exception ex) {
            throw ex;
        }

        System.out.printf("Run time: %d", System.nanoTime() - start);

    }

}
