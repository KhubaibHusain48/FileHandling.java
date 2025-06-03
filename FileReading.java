package Concepts.FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReading {
    public static void main(String[] args) {
        String FN = "D:\\Java Books\\Java Coding\\Advanced Java\\src\\Concepts\\FileHandling\\Java.txt";
        try (FileReader reader = new FileReader(FN)) {
            int read = 0;
            do {
                read = reader.read();
                System.out.print((char) read);
            } while (read != -1);
        } catch (
                IOException e) {
            System.out.printf("Error: %s\n", e.getMessage());
        }
    }
}
