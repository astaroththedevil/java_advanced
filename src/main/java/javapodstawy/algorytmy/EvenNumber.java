package javapodstawy.algorytmy;

public class EvenNumber {

    public static boolean isEven(int number){
        boolean isNumberEven = false;
        if(number % 2 == 0){
            isNumberEven = true;
        }
        return isNumberEven;
    }

    public static void main(String[] args) {
        System.out.println(isEven(6));
    }
}
