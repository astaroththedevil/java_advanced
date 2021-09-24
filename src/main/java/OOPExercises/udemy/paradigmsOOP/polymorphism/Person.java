package OOPExercises.udemy.paradigmsOOP.polymorphism;

public class Person {

    private Animal animal;

    public void getTheAnimal(Animal animal){
        this.animal = animal;
    }

    public void animalName(){
        if(animal != null){
            animal.introduce();
        }else {
            System.out.println("No animal");
        }
    }
}
