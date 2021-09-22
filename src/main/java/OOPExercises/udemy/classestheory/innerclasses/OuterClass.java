package OOPExercises.udemy.classestheory.innerclasses;

public class OuterClass {

    int outerField;

    int outerMethod() {
        Inner inner = new Inner();
        inner.innerMethod();
        inner.innerField = 9;
        return -1;
    }

    class Inner {
        int innerField;

        int innerMethod() {
            outerMethod();
            outerField = 7;
            return -2;
        }
    }
}
