package OOPExercises.udemy.methodstheory.superinconstructor;

public class ExtendingClass extends BasicClass{

    ExtendingClass(){
        super(3);
        System.out.println("Invoked constructor from extending class");
    }
}
