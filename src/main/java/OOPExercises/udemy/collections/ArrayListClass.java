package OOPExercises.udemy.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList basicList = new ArrayList();
        basicList.add(new String("Some text"));
        basicList.add("Some info");

        String strEl = (String) basicList.get(0);
        System.out.println(strEl);

        ArrayList<String> arrStr = new ArrayList<>();
        arrStr.add("Kate");
        arrStr.add("Jim");
        arrStr.add("Lily");
        arrStr.remove(1);
        arrStr.add("David");

        for (String s : arrStr) {
            System.out.println(s);
        }

//        Kate
//        Lily
//        David

        System.out.println("---------------------------------------------------------------");

        arrStr.add(0, "Edvin");

        for (String s : arrStr) {
            System.out.println(s);
        }

//        Edvin
//        Kate
//        Lily
//        David

        arrStr.set(1, "Kathrine");

        System.out.println("---------------------------------------------------------------");

        for (String s : arrStr) {
            System.out.println(s);
        }

        System.out.println("---------------------------------------------------------------");

        Collections.sort(arrStr);

        for (String s : arrStr) {
            System.out.println(s);
        }

        System.out.println("---------------------------------------------------------------");
        arrStr.remove(0);

        for (String s : arrStr) {
            System.out.println(s);
        }
    }

}
