package OOPExercises.udemy.methodstheory.exceptions;

import java.io.FileNotFoundException;

public class ThrowingExceptions {
    public static void main(String[] args) {

        ExceptionThrowed exceptionThrowed = new ExceptionThrowed();
        try {
            exceptionThrowed.exceptionMethod();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
