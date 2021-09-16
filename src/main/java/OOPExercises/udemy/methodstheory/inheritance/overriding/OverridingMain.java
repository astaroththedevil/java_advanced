package OOPExercises.udemy.methodstheory.inheritance.overriding;

public class OverridingMain {
    public static void main(String[] args) {

        BasicClass basicClass = new BasicClass();
        ExtendingClass extendingClass = new ExtendingClass();

        basicClass.method();
        extendingClass.method();
    }
}
