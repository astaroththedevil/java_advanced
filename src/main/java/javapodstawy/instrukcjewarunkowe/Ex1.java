package javapodstawy.instrukcjewarunkowe;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        isEvenOrOdd(a);

    }

    static void isEvenOrOdd (int a){
        if (a % 2 == 0){
            System.out.println("The number is even");
        }
        if (a % 2 != 0){
            System.out.println("The number is odd");
        }
    }
}
