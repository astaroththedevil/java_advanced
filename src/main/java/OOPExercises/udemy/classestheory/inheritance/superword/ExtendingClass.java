package OOPExercises.udemy.classestheory.inheritance.superword;

public class ExtendingClass extends BasicClass{

    @Override
    void method() {
        super.method();
        System.out.println("Text from extending class");
    }
}
