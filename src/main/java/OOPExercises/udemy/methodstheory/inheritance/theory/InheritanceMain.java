package OOPExercises.udemy.methodstheory.inheritance.theory;

public class InheritanceMain {

    public static void main(String[] args) {
        BasicClass basicClass = new BasicClass();
        basicClass.firstMethod();
        basicClass.secondMethod();

        ExtendingClass extendingClass = new ExtendingClass();
        extendingClass.firstMethod();
        extendingClass.secondMethod();
        extendingClass.methodFromExtendingClass();

        AnotherExtendingClass anotherExtendingClass = new AnotherExtendingClass();
        anotherExtendingClass.firstMethod();
        anotherExtendingClass.secondMethod();
        anotherExtendingClass.methodFromExtendingClass();
    }
}
