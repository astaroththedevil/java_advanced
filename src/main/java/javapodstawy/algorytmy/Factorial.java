package javapodstawy.algorytmy;

public class Factorial {

    public static long countFactorial(int number){
        long result = 1;
        for (int i = 2; i <= number; i++){
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countFactorial(7));
    }
}
