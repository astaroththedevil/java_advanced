package OOPExercises.udemy.methodstheory.classeswithfields;

public class FieldsClass {

    int number;

    void valueFromField(){
        System.out.println(number);
    }

    void setFieldValue(int value){
        number = value;
    }

    int returnFieldValue(){
        return number;
    }
}
