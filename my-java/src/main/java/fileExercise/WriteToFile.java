package fileExercise;

import java.io.FileWriter;
import java.io.IOException;
public class WriteToFile {
    public static void writeNames(String path , String[] names){

        try(FileWriter writeFile = new FileWriter(path)){
            for(String name: names) {
                writeFile.write(name+ "\n");
            }

        }catch (IOException e){
            System.out.println("Error writing to file: "+e.getMessage());
        }
    }
}
