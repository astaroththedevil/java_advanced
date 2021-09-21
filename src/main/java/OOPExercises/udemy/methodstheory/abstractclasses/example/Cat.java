package OOPExercises.udemy.methodstheory.abstractclasses.example;

public class Cat extends Mammal{
    @Override
    public void sound() {
        System.out.println("Meow!");
    }

    @Override
    public void movement() {
        System.out.println("Walkin' on fornitures");
    }
}
