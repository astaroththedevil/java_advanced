package javapodstawy.algorytmy;

public class SumOfDigitsInNumber {

    public static int sumOfDigits(int givenNumber){
        int sum = 0;
        while (givenNumber != 0){
            sum = sum + (givenNumber % 10);
            givenNumber = givenNumber / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(577));
    }
}
