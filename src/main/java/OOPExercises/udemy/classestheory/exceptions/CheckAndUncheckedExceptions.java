package OOPExercises.udemy.classestheory.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class CheckAndUncheckedExceptions {
    public static void main(String[] args) {

        File file = new File("resources/file.txt");
        //Check exception
        try {
            InputStream inputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
