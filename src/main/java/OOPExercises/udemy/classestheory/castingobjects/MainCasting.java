package OOPExercises.udemy.classestheory.castingobjects;

public class MainCasting {
    public static void main(String[] args) {

        ExtendingClass extendingClass = new ExtendingClass();
        extendingClass.setNum(777);
        extendingClass.printNum();

        BasicClass basicClass = (BasicClass) extendingClass;
        basicClass.printNum();

        Object object = basicClass;

    }
}
