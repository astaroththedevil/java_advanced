package OOPExercises.udemy.methodstheory.constructors;

public class ConstructorsClass {

    int firstField;
    int secondField;

    public ConstructorsClass(int firstField, int secondField) {
        this.firstField = firstField;
        this.secondField = secondField;
    }

    public ConstructorsClass(int firstField) {
        this.firstField = firstField;
        this.secondField = 100;
    }
}
