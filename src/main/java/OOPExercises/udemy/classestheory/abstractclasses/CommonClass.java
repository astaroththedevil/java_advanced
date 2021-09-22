package OOPExercises.udemy.classestheory.abstractclasses;

public class CommonClass extends AbstractClass{


    @Override
    public void abstractMethod() {
        System.out.println("Text from common class which is overrided");
    }

    @Override
    protected int abstractMethodWithParam(String str) {
        System.out.println("Printing parameter: " + str);
        return 7;
    }
}
