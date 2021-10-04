package OOPExercises.udemy.collections;

import java.util.ArrayList;
import java.util.Iterator;

class Car {
    private String manufacturer;
    private String name;
    private int year;

    public Car(String manufacturer, String name, int year) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}

public class ArrayListIteration {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Mercedes", "SLA", 2020));
        cars.add(new Car("Toyota", "Avensis", 2021));
        cars.add(new Car("Aston Martin", "DB11", 2019));

        System.out.println("For loop");
        for (int i = 0; i < cars.size(); i++){
            Car car = cars.get(i);
            System.out.println(car);
        }
        System.out.println("_____________________________________________________");

        System.out.println("For each loop");
        for (Car car : cars){
            System.out.println(car);
        }
        System.out.println("-----------------------------------------------------");

        System.out.println("Iterator");
        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext()){
            Car car = iterator.next();
            System.out.println(car);
        }
    }
}
