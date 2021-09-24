package OOPExercises.udemy.paradigmsOOP.polymorphism;

public class PolymorphismMain {
    public static void main(String[] args) {
        Person person = new Person();
        Dog dog = new Dog("Woofer");
        Horse horse = new Horse("Rafał");

        person.getTheAnimal(horse);
        person.animalName();

        //or

        person.getTheAnimal(dog);
        person.animalName();
    }
}
