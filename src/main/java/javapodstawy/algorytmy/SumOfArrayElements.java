package javapodstawy.algorytmy;

public class SumOfArrayElements {

    public static int arraySum(int [] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int [] array = {3, 4, 5};
        System.out.println(arraySum(array));
    }
}
