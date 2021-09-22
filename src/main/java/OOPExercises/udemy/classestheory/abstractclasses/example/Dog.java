package OOPExercises.udemy.classestheory.abstractclasses.example;

public class Dog extends Mammal{
    @Override
    public void sound() {
        System.out.println("Woof!");
    }

    @Override
    public void movement() {
        System.out.println("On four paws");
    }
}
