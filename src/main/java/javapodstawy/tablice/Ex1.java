package javapodstawy.tablice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        List inputList = Arrays.asList(input);
        Set inputSet = new HashSet(inputList);
        if (inputSet.size() < inputList.size()) {
            return true;
        }else {
            return false;
        }
    }


    //------------------------- WYWOŁANIA METOD ----------------------------
    public static void main(String[] args) {
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

        int[] array2 = {2, 2, 3, 3};
        System.out.println(isDuplicated(array2));
    }
}
