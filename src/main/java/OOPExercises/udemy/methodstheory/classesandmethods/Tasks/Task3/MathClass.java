package OOPExercises.udemy.methodstheory.classesandmethods.Tasks.Task3;

public class MathClass {

    public static final double PI = Math.PI;
    public static double radius = 3;
    public static double a = 4;
    public static double b = 5;

    public static double circuitCircle(double radius) {
        if (radius < 0) {
            throw new MinusNumberRuntimeException("Radius cannot be less than 0");
        } else {

            return 2 * PI * radius;
        }
    }

    public static double areaCircle(double radius) {
        return Math.pow(PI * radius, 2);
    }

    public static double circuitRectangle(double a, double b) {
        return 2 * a + 2 * b;
    }

    public static double areaRectangle(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {

        System.out.println(Math.round(circuitCircle(radius)));
        System.out.println(Math.round(areaCircle(radius)));
        System.out.println(circuitRectangle(a, b));
        System.out.println(areaRectangle(a, b));
    }
}
