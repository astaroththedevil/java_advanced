package OOPExercises.udemy.classestheory.abstractclasses;

public abstract class AbstractClass {
    public void aMethod(){
        System.out.println("A text from method");
    }

    public abstract void abstractMethod();

    protected abstract int abstractMethodWithParam(String str);

}
