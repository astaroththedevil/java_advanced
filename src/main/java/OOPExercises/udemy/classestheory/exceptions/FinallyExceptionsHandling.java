package OOPExercises.udemy.classestheory.exceptions;

public class FinallyExceptionsHandling {
    static String str = "some text";

    public static void main(String[] args) {

        try {
            System.out.println("Everything uppercase " + str.toUpperCase());
            str.charAt(9);
        } catch (NullPointerException e) {
            System.out.println("Null!");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("You are out of String range!");
        } finally {
            System.out.println("This block (finally) will always execute");
        }
    }
}
// We can build program only with try and finally without catch
