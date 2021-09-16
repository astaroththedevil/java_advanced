package OOPExercises.udemy.methodstheory.classesandmethods.Tasks.Task1;

public class Main {

    public static void main(String[] args) {

        Programmer programmer = new Programmer("James", "Smith", "english", 20000);

        System.out.println(programmer.returnName());
        System.out.println(programmer.returnSurname());
        System.out.println(programmer.returnLanguage());
        System.out.println(programmer.returnWages());
    }


}
