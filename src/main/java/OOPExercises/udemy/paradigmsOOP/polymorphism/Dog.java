package OOPExercises.udemy.paradigmsOOP.polymorphism;

public class Dog extends Mammal{


    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Pow wow!");
    }

    @Override
    public void introduce() {
        System.out.println("dog named " + name);
    }
}
