package OOPExercises.udemy.classestheory.exceptions.creatingexceptionsexamples;

public class CreatingExceptionsMain {
    public static void main(String[] args) {
UserToCreateException user = new UserToCreateException();
        try {
            user.giveEmail("jan.kowalski@wpp.pl");
            user.givePassword("qwerty123secret");
            System.out.println("Password is safe");
            System.out.println("Mail is ok");
        } catch (BadPasswordExampleCreatingException e) {
            e.printStackTrace();
        } catch (BadEmailExampleRuntimeException e){
            e.printStackTrace();
        }
    }
}
