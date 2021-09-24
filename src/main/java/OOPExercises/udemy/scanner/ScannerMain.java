package OOPExercises.udemy.scanner;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        while (true) {
//            String text = scanner.nextLine();
//            System.out.println(text);
//            if(text.equals("stop")){
//                System.out.println("the end");
//                break;
//            }
//        }

        String line;
//        do {
//            line = scanner.nextLine();
//            System.out.println(line);
//        } while (!line.equals("stop"));
//        System.out.println("The End");

        while (!(line = scanner.nextLine()).equals("stop")){
            System.out.println(line);
        }
        System.out.println("The End");
    }
}
