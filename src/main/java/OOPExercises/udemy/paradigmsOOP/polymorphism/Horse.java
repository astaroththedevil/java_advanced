package OOPExercises.udemy.paradigmsOOP.polymorphism;

public class Horse extends Mammal{


    public Horse(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("horse sound");
    }

    @Override
    public void introduce() {
        System.out.println("Horse named " + name);
    }
}
