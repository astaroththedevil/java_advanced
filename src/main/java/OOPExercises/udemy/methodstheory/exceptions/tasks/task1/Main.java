package OOPExercises.udemy.methodstheory.exceptions.tasks.task1;

public class Main {
    public static void main(String[] args) {

        try {
        int a = 6;
        int b = 0;
        System.out.println(a / b);

        } catch (ArithmeticException e){
            System.out.println("Cannot divide by 0");
        }
    }
}
