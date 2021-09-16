package OOPExercises.udemy.methodstheory.inheritance.task;

public class Employee extends Person{

    private String occupation;
    private String companyName;

    public Employee(String name, String surname, String occupation, String companyName) {
        super(name, surname);
        this.occupation = occupation;
        this.companyName = companyName;
    }

    @Override
    public void introduceYourself(){
        super.introduceYourself();
        System.out.println(" I work in " + companyName + " as a " + occupation + ".");
    }
}
