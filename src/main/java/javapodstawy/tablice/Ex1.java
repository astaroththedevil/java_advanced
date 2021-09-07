package javapodstawy.tablice;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Ex1 {
    //-------------------------- METODY -------------------------------

    public static boolean isFound(int[] array, int numberToFind) {
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToFind) {
                result = true;
            }
        }
        return result;
    }

    public static int indexOfElement(int[] array, int givenNumber) {
        int foundIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == givenNumber) {
                foundIndex = i;
                break;
            } else {
                foundIndex = -1;
            }
        }
        return foundIndex;
    }

    public static double average(int... nums) {
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum / nums.length;
    }

    public static int maxValue(int... nums) {
        int maxNum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (maxNum < nums[i]) {
                maxNum = nums[i];
            }
        }
        return maxNum;
    }

    public static int minValue(int... nums) {
        int minNum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (minNum > nums[i]) {
                minNum = nums[i];
            }
        }
        return minNum;
    }

    public static boolean isDuplicated(int[] input) {
        List<Integer> inputList = new ArrayList();
        for (int i = 0; i < input.length; i++) {
            inputList.add(input[i]);
        }
        List<Integer> inputSet = inputList.stream().distinct().collect(Collectors.toList());
//        System.out.println(inputSet);

        if (input.length > inputSet.size()) {
            return true;
        } else {
            return false;
        }
    }

    public static List<Integer> returnWithoutDuplicates(int[] array) {
        List<Integer> inputList = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            inputList.add(array[i]);
        }
        List<Integer> inputSet = inputList.stream().distinct().collect(Collectors.toList());
//        inputSet.toArray();
        return inputSet;
    }

    public static void writeCommonElements(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println(array1[i]);
                }
            }
        }
    }

    public static boolean benchmarkArrays(int[] array1, int[] array2) {
        boolean areSimilar = false;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j] && array1.length == array2.length) {
                    areSimilar = true;
                } else {
                    areSimilar = false;
                }
            }
        }
        return areSimilar;
    }

    public static void invertedArray(String [] array){

        String [] inverted = new String[array.length];
        for (int i = array.length - 1; i >= 0; i--){
            inverted[i] = array[i];
            System.out.println(inverted[i]);
        }
    }

    public static void bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }




        //------------------------- WYWOŁANIA METOD ----------------------------
        public static void main (String[]args){
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
            System.out.println(isFound(array, 7));
            System.out.println("------------------------");

            System.out.println(indexOfElement(array, 7));
            System.out.println("------------------------");

            System.out.println(average(1, 2, 3, 4));
            System.out.println("------------------------");

            System.out.println(maxValue(15, 30, 45, 90));
            System.out.println("------------------------");

            System.out.println(minValue(20, 40, 60, 80, 100));
            System.out.println("------------------------");

            int[] array2 = {2, 2, 3, 3, 4, 6, 7, 8, 9, 0, 9, 8, 3, 4, 5, 1, 6, 1, 3};
            System.out.println(isDuplicated(array2));
            System.out.println("------------------------");

            System.out.println(returnWithoutDuplicates(array2));
            System.out.println("------------------------");

            int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 33};
            int[] array4 = {2, 4, 6, 8, 33};
            Ex1.writeCommonElements(array3, array4);
            System.out.println("------------------------");

            int [] array5 = {1, 2, 3};
            int [] array6 = {1, 2, 3};
            System.out.println(benchmarkArrays(array5, array6));

            String [] array7 = {"A", "B", "C", "D", "E", "F"};
            Ex1.invertedArray(array7);
            System.out.println("------------------------");

            int [] bubbleArray = {6, 5, 3, 1, 8, 7, 2, 4};
            bubbleSort(bubbleArray);
            System.out.println(Arrays.toString(bubbleArray));

        }
    }
