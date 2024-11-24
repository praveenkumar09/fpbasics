package com.udemy.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileAPIChangesExample {
    public static void main(String[] args) {
        Path path = Paths.get("/Users/praveenkumarthangaraj/Documents/fp/module/basics/fpbasics/src/main/java/com/udemy/java11/FilechangesDemo.txt");
        try {
            //Files.writeString(path,"Java is cool!");
            String readString = Files.readString(path);
            System.out.println(readString);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
