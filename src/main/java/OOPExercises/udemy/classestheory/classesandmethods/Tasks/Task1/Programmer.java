package OOPExercises.udemy.classestheory.classesandmethods.Tasks.Task1;

public class Programmer {
    private String name;
    private String surname;
    private String language;
    private int wages;

    public Programmer(String name, String surname, String language, int wages) {
        this.name = name;
        this.surname = surname;
        this.language = language;
        this.wages = wages;
    }

    public String returnName(){
        return name;
    }

    public String returnSurname(){
        return surname;
    }

    public String returnLanguage(){
        return language;
    }

    public int returnWages(){
        return wages;
    }
}
