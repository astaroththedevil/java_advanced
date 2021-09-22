package OOPExercises.udemy.classestheory.exceptions;

public class ExceptionsHandling {
    static String str;
    static int [] array;
    public static void main(String[] args) {

        try {
            System.out.println("Is empty? " + str.isEmpty());
        } catch (NullPointerException e) {
            System.out.println("Nie utworzyłeś stringa");
        }

        array = new int[3];
        try {
            array[0] = 3;
            array[1] = 7;
            array[2] = 9;
            System.out.println("Everything is alright");
        } catch (NullPointerException e){
            System.out.println("Create a minimum two elements array");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("You are out of array range!");
        }
//        catch (NullPointerException | ArrayIndexOutOfBoundsException e){
//            System.out.println("Array error!");
//        } catching two exceptions in one catch block

        System.out.println("Some text at the end of program");
    }
}
