package OOPExercises.udemy.methodstheory.interfaces.example;

public class Bird implements AnimalsInterface{
    @Override
    public void breathing() {
        System.out.println("lungs");
    }

    @Override
    public void eating() {
        System.out.println("bugs");
    }

    @Override
    public void reproduction() {
        System.out.println("eggs");
    }
}
