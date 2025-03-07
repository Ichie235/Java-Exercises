package fileExercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
    public static void copyFile(String sourcePath, String destinationPath) {
        try (FileReader readFile = new FileReader(sourcePath);
                  FileWriter writeToFile = new FileWriter(destinationPath);) {
            int character;
            while ((character = readFile.read()) != -1) {
                System.out.println((char) character);
                writeToFile.write(character);
            }
        } catch (IOException e) {
            System.out.println("Error occured while copying file: " + e.getMessage());
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        String sourcePath = "";
        String destinationPath = "";
        try{
            CopyFile.copyFile(sourcePath,destinationPath);
        } catch (Exception e) {
            throw new FileNotFoundException("Files not found");
        }
    }
}
