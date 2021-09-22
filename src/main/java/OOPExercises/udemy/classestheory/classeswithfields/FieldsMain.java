package OOPExercises.udemy.classestheory.classeswithfields;

public class FieldsMain {
    public static void main(String[] args) {

        FieldsClass obj = new FieldsClass();
        obj.number = 7;
        System.out.println(obj.number);

        obj.valueFromField();
        obj.setFieldValue(101);
        obj.valueFromField();

        obj.setFieldValue(77);
        int someValue = obj.returnFieldValue();
        System.out.println(someValue);
    }

}
