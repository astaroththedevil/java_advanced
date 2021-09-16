package OOPExercises.udemy.methodstheory.inheritance.task;

public class Person {
    protected String name;
    protected String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void introduceYourself() {
        System.out.printf("I am " + name + " " + surname + ".");
    }
}
