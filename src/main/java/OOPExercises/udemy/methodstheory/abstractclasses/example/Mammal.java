package OOPExercises.udemy.methodstheory.abstractclasses.example;

public abstract class Mammal {

    public void feedingChildren(){
        System.out.println("Feeding with milk");
    }

    public void bodyTemperature(){
        System.out.println("Static temperature of body");
    }

    public void giveNumOfLimbs(){
        System.out.println("Four limbs");
    }

    public abstract void sound();

    public abstract void movement();
}
