package OOPExercises.udemy.methodstheory.abstractclasses.example;

public class Horse extends Mammal{
    @Override
    public void sound() {
        System.out.println("Ihaaa");
    }

    @Override
    public void movement() {
        System.out.println("Galloping");
    }
}
