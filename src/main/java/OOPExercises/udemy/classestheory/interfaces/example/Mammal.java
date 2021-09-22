package OOPExercises.udemy.classestheory.interfaces.example;

public class Mammal implements AnimalsInterface{
    @Override
    public void breathing() {
        System.out.println("lungs");
    }

    @Override
    public void eating() {
        System.out.println("Plants or meet");
    }

    @Override
    public void reproduction() {
        System.out.println("giving birth");
    }
}
