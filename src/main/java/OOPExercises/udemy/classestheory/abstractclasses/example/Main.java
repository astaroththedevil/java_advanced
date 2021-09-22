package OOPExercises.udemy.classestheory.abstractclasses.example;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Horse horse = new Horse();

        System.out.println("For dog:");
        dog.sound();
        dog.movement();
        dog.feedingChildren();
        dog.giveNumOfLimbs();
        dog.bodyTemperature();
        System.out.println();

        System.out.println("For cat:");
        cat.sound();
        cat.movement();
        cat.feedingChildren();
        cat.giveNumOfLimbs();
        cat.bodyTemperature();
        System.out.println();

        System.out.println("For horse:");
        horse.sound();
        horse.movement();
        horse.feedingChildren();
        horse.giveNumOfLimbs();
        horse.bodyTemperature();
    }
}
