package OOPExercises.udemy.classestheory.inheritance.superword.example_1;

public class SuperTest {
    public static void main(String[] args) {
        Student student = new Student("John", "Smith", 5);
        Teacher teacher = new Teacher("Mary", "Austin", "math");
        Principle principle = new Principle("Wilford", "Jones", 7);

        System.out.println(student.toString());
        System.out.println(teacher.toString());
        System.out.println(principle.toString());
    }
}
