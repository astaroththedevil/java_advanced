package OOPExercises.udemy.paradigmsOOP.encapsulation;

public class Encapsulation {
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void changeSurname(String surname){
        this.surname = surname;
    }
}
