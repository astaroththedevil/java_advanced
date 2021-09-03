package javapodstawy.algorytmy;

public class SumOfRepeats {

    public static int sumOfRepeats(int [] array){
        int counter = 0;
        int number = 1;
        for (int i = 0; i < array.length; i++){
            if (array[i] == number){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int [] array = {1, 6, 4, 1, 9, 8, 1};
        System.out.println(sumOfRepeats(array));
    }
}
