package OOPExercises.udemy.paradigmsOOP.summary;

import java.util.Scanner;

public class SummaryMain {
    public static void main(String[] args) {
        service();
    }

    private static void service() {
        Scanner scanner = new Scanner(System.in);
        UE43RU7172 tv = new UE43RU7172("ID123");

        int option = 0;
        System.out.println("1. Switch on; 2. Switch off; 3. Switch channel; 4. Close program");
        while (option != 4) {
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    tv.on();
                    break;
                case 2:
                    tv.off();
                    break;
                case 3:
                    System.out.println("Give channel num");
                    int num = scanner.nextInt();
                    tv.switchChannel(num);
                    break;
            }
        }
    }
}
