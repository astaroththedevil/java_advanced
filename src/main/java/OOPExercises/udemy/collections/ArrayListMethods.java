package OOPExercises.udemy.collections;

import java.util.ArrayList;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class ArrayListMethods {
    public static void main(String[] args) {
        Person p1 = new Person("Jack");
        Person p2 = new Person("Luke");
        Person p3 = new Person("Drake");
        Person p4 = new Person("Lilly");

        ArrayList<Person> arr1 = new ArrayList<>();
        arr1.add(p1);
        arr1.add(p2);
        arr1.add(p3);
        arr1.add(p4);

        for (Person p : arr1) {
            System.out.println(p);
        }
        System.out.println("---------------------------------------------------");

        Person p5 = new Person("Bart");
        Person p6 = new Person("Mick");
        ArrayList<Person> arr2 = new ArrayList<>();
        arr2.add(p5);
        arr2.add(p6);

        arr1.addAll(arr2);
        for (Person p : arr1) {
            System.out.println(p);
        }
        System.out.println("---------------------------------------------------");

        if (arr1.contains(p4)) {
            System.out.println("arr1 contains p4");
        }
        System.out.println("---------------------------------------------------");

        if (arr1.containsAll(arr2)) {
            System.out.println("arr1 contains arr2");
        }
        System.out.println("---------------------------------------------------");

        Person p7 = new Person("Willy");
        arr2.add(p7);

        if (arr1.containsAll(arr2)) {
            System.out.println("arr1 contains arr2");
        } else {
            System.out.println("arr1 doesn't contain all arr2 elements");
        }
        System.out.println("---------------------------------------------------");

        arr2.remove(p7);
        if (arr1.containsAll(arr2)) {
            System.out.println("arr1 contains arr2");
        } else {
            System.out.println("arr1 doesn't contain all arr2 elements");
        }
        System.out.println("---------------------------------------------------");

        arr1.removeAll(arr2);
        for (Person p : arr1) {
            System.out.println(p);
        }

        Person people[] = new Person[arr1.size()];
        people = arr1.toArray(people);
        System.out.println(people.length);
        System.out.println("---------------------------------------------------");

        arr1.clear();
        if(arr1.isEmpty()){
            System.out.println("Is empty");
        }
    }
}
