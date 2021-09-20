package OOPExercises.udemy.methodstheory.exceptions.creatingexceptionsexamples;

public class BadEmailExampleRuntimeException extends RuntimeException{
    public BadEmailExampleRuntimeException(String message){
        super(message);
    }
}
