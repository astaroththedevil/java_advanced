package OOPExercises.udemy.methodstheory.interfaces;

import OOPExercises.udemy.methodstheory.interfaces.example.Bird;
import OOPExercises.udemy.methodstheory.interfaces.example.Fish;
import OOPExercises.udemy.methodstheory.interfaces.example.Mammal;

public class InterfaceMain {
    public static void main(String[] args) {

        Fish fish = new Fish();
        Bird bird = new Bird();
        Mammal mammal = new Mammal();

        System.out.println("For fish:");
        fish.breathing();
        fish.eating();
        fish.reproduction();
        System.out.println();

        System.out.println("For bird:");
        bird.breathing();
        bird.eating();
        bird.reproduction();
        System.out.println();

        System.out.println("For mammal:");
        mammal.breathing();
        mammal.eating();
        mammal.reproduction();
        System.out.println();
    }
}
