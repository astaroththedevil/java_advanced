package OOPExercises.udemy.scanner;

import java.util.Scanner;

public class DelimiterAndSignsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(",");

        System.out.println("Type something");
        while(scanner.hasNext()){
            String next = scanner.next();
            System.out.println(next);
        }
        System.out.println("The end");
        scanner.close();
    }
}
