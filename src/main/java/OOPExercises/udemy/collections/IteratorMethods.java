package OOPExercises.udemy.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMethods {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("BMW");
        arr.add("Opel");
        arr.add("Audi");

        arr.iterator().forEachRemaining(el -> System.out.println(el));

        Iterator<String> iterator = arr.iterator();

        while (iterator.hasNext()){
            String str = iterator.next();
            if(str.equalsIgnoreCase("opel")){
                iterator.remove();
            }
        }
        System.out.println(arr);
    }
}
