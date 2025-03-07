package fileExercise;

import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
  public static void readFile(String path){
      try(FileReader reader = new FileReader(path)){
          int character;
          while((character = reader.read()) != -1){
                      System.out.println((char) character);
                  }

      }catch (IOException e){
          System.out.println("Error reading file: "+ e.getMessage());

      }
  }
}
