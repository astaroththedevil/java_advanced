package javapodstawy.algorytmy;

public class Average {

    public static double getAverage(double [] array){
        double result = 0;
        for (int i = 0; i < array.length; i++){
            result += array[i];
        }
        return result / array.length;
    }

    public static void main(String[] args) {
        double [] array = {0, 4, 7, 19, 123, 698};
        System.out.println(getAverage(array));
    }
}
