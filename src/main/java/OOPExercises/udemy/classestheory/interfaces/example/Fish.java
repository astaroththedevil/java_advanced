package OOPExercises.udemy.classestheory.interfaces.example;

public class Fish implements AnimalsInterface{
    @Override
    public void breathing() {
        System.out.println("gills");
    }

    @Override
    public void eating() {
        System.out.println("plankton");
    }

    @Override
    public void reproduction() {
        System.out.println("roe");
    }
}
