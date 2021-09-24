package OOPExercises.udemy.scanner;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int num = scanner.nextInt();
        for(int i = 0; i < num; i++){
            System.out.println(line);
        }
    }
}
