package OOPExercises.udemy.classestheory.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ExceptionThrowed {

    public void exceptionMethod() throws FileNotFoundException {
        File file = new File("resources/file.txt");
        InputStream inputStream = new FileInputStream(file);
    }
}
// Exception handling was moved to class ThrowingExceptions and handled there
