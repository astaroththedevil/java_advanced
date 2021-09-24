package OOPExercises.udemy.scanner;

import java.util.Scanner;

public class ScannerMethodsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            System.out.println(num);
        }
        System.out.println("The End");
    }
}
