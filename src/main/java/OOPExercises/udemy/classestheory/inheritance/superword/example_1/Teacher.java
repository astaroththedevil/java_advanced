package OOPExercises.udemy.classestheory.inheritance.superword.example_1;

import java.util.Locale;

public class Teacher extends Person {
    private String subject;

    public Teacher(String subject) {
        this.subject = subject;
    }

    public Teacher(String name, String surname, String subject) {
        super(name, surname);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        subject = subject.toLowerCase();
        switch (subject) {
            case "math":
            case "english":
            case "sport":
                this.subject = subject;
                break;
            default:
                this.subject = "unknown";
        }
    }
}
