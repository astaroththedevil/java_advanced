package javapodstawy.algorytmy;

import java.sql.Array;

public class Dominance {

    public static int getDominance(int [] array){

        int [] foundValues = {};
        int [] sumOfRepeats = {};
        int counter = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == array[i++]){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
//        int [] array = {1, 3, 3, 4, 3};
//        System.out.println(getDominance(array));
    }
}
