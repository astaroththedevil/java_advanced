package OOPExercises.udemy.methodstheory.objectsandprymitives;

public class ClassObjectPrymitiveType {
    public static void main(String[] args) {

        int prymitive = 7;

        Example example = new Example();
        example.printNumber(9);

        Example nextExample = new Example();

        example.field = 77;
        nextExample.field = 99;

        System.out.println("example: " + example.field);
        System.out.println("nextExample: " + nextExample.field);

        System.out.println("Printing prymitive: " + prymitive);
        System.out.println("Printing object: " + example + "\n" + nextExample);
    }
}
