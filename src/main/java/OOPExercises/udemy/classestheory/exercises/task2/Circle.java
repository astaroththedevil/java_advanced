package OOPExercises.udemy.classestheory.exercises.task2;

public class Circle implements Figures{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double circuit() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
