package OOPExercises.udemy.classestheory.exceptions.creatingexceptionsexamples;

public class UserToCreateException {
    public void givePassword(String password) throws BadPasswordExampleCreatingException {
        if(!password.contains("secret")){
            throw new BadPasswordExampleCreatingException("Password not safe");
        }
    }

    public void giveEmail(String email){
        if(!email.contains("@")){
            throw new BadEmailExampleRuntimeException("Email doesn't contain @");
        }
    }
}
