package OOPExercises.udemy.classestheory.exceptions.tasks.task2;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(divide(6, 0));
        } catch (DividingByZeroException e) {
            e.printStackTrace();
        }
    }

    public static double divide(int a, int b) throws DividingByZeroException {
        if (b == 0) {
            throw new DividingByZeroException("Cannot divide by 0");
        } else {

            return a / b;
        }
    }
}
