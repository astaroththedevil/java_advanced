package OOPExercises.udemy.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        arr.add("BMW");
        arr.add("Ford");
        arr.add(null);
        arr.add("Honda");
        arr.add(null);

        arr.removeIf(a -> a == null || a.equalsIgnoreCase("Ford"));

        System.out.println(arr);
    }
}
