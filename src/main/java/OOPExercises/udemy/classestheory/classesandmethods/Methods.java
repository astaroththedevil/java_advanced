package OOPExercises.udemy.classestheory.classesandmethods;

public class Methods {
    public static void main(String[] args) {

        ClassForMethods myObject = new ClassForMethods();

        myObject.voidMethod();
        myObject.voidMethodWithArgument(5, 'D');
        myObject.voidAnotherMethod(true, 100);
        myObject.voidAnotherMethod(false, 1000);

        int sumResult = myObject.sumNums(7, 8);
        System.out.println("Result: " + sumResult);

        double sumDoubles = myObject.sumDoubles(3.3);
        System.out.println("Result: " + sumDoubles);

        System.out.println("Changed value: " + myObject.changeValue(true));

        System.out.println("Am I supposed to return? " + myObject.returnValue(true, 7));
        System.out.println("Am I supposed to return? " + myObject.returnValue(false, 7));
    }
}
