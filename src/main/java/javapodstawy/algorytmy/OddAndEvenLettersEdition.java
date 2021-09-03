package javapodstawy.algorytmy;

import java.util.Scanner;

public class OddAndEvenLettersEdition {

    public static void main(String[] args) {

        System.out.println("Podaj tekst do przetworzenia...");
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        String result = "";
        int index = 0;

        char[] tabOfChars = inputText.toCharArray();
        for (char c : tabOfChars) {
            if(index % 2 == 0){
                result = result + String.valueOf(c).toUpperCase();

            }else{
                result = result + c;
            }

            index++;

        }

        System.out.println("Zmodyfikowany tekst: "+ result);


    }
}
