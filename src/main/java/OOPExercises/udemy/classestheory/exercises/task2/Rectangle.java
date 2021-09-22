package OOPExercises.udemy.classestheory.exercises.task2;

public class Rectangle implements Figures{

    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double circuit() {
        return 2 * (a + b);
    }

    @Override
    public double area() {
        return a * b;
    }
}
