package OOPExercises.udemy.classestheory.classesandmethods.Tasks.Task2;

public class Main {
    public static void main(String[] args) {

        int [] array = {1, 7, 3, 9, 4};
        SomeMath first = new SomeMath(array);

        System.out.println(first.sumArray(array));
        System.out.println(first.average(array));
        System.out.println(first.max(array));
        System.out.println(first.min(array));
    }
}
