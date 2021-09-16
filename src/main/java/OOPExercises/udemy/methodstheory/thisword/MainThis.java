package OOPExercises.udemy.methodstheory.thisword;

public class MainThis {

    public static void main(String[] args) {

        ExtendingClass obj1 = new ExtendingClass();
        System.out.println("---------------------------------------------");
        ExtendingClass obj2 = new ExtendingClass(77);
        System.out.println("---------------------------------------------");
        ExtendingClass obj3 = new ExtendingClass(14, 21);
        System.out.println(obj3.x);
        System.out.println(obj3.y);
        obj3.methodWithParams(82);
        System.out.println("field: " + obj3.field);
    }
}
