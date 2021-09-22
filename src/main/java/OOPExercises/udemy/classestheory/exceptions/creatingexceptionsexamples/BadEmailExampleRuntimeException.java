package OOPExercises.udemy.classestheory.exceptions.creatingexceptionsexamples;

public class BadEmailExampleRuntimeException extends RuntimeException{
    public BadEmailExampleRuntimeException(String message){
        super(message);
    }
}
