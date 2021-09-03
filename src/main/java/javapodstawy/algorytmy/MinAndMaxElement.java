package javapodstawy.algorytmy;

import java.util.Arrays;

public class MinAndMaxElement {

    public static int getMinNumber(int [] array){
        int minNumber = array[0];
        for (int i = 1; i < array.length; i++){
            if(minNumber > array[i]){
                minNumber = array[i];
            }
        }
        return minNumber;
    }

    public static int getMaxNumber(int [] array){
        int maxNumber = array[0];
        for(int i = 1; i < array.length; i++){
            if(maxNumber < array[i]){
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }

    public static void main(String[] args) {
        int [] array = {1, 2, 3};
        System.out.println(getMinNumber(array));
        System.out.println(getMaxNumber(array));
    }
}
