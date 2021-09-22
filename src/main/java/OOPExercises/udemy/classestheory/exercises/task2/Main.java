package OOPExercises.udemy.classestheory.exercises.task2;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(3);
        System.out.println(Math.round(circle.circuit()));
        System.out.println(Math.round(circle.area()));

        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println(rectangle.circuit());
        System.out.println(rectangle.area());
    }

}
