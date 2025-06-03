package Concepts.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args) {
        String fileName = "D:\\Java Books\\Java Coding\\Advanced Java\\src\\Concepts\\FileHandling\\Java.txt";
        try (FileWriter fw = new FileWriter(fileName)){
            fw.write("Hello World");
            fw.flush();
            System.out.println("File written successfully");
        } catch (IOException e) {
            System.out.printf("File writing failed: %s%n", e.getMessage());
        }
    }
}
