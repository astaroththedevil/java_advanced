package javapodstawy.instrukcjewarunkowe;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj jakie działanie chcesz wykonać?" +
                "\n 1 dodawanie dwóch liczb" +
                "\n 2 wartość bezwzględna" +
                "\n 3 maksymalna liczba z trzech podanych" +
                "\n 4 liczba o przeciwnym znaku do podanej"
        );


        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("Podaj pierwszą liczbę:");
                double a = scanner.nextDouble();
                System.out.println("Podaj drugąą liczbę:");
                double b = scanner.nextDouble();
                System.out.println("Suma podanych liczb to: " + add(a, b));
                break;

            case 2:
                System.out.println("Podaj liczbę:");
                double num = scanner.nextDouble();
                System.out.println("Wartość bezwzględna z podanej liczby to: " + absolute(num));
                break;

            case 3:
                System.out.println("Podaj pierwszą liczbę:");
                double c = scanner.nextDouble();
                System.out.println("Podaj drugą liczbę:");
                double d = scanner.nextDouble();
                System.out.println("Podaj trzecią liczbę:");
                double e = scanner.nextDouble();
                System.out.println("Maksymalna liczba z podanych to: " + maxNumber(c, d, e));
                break;

            case 4:
                System.out.println("Podaj liczbę");
                double f = scanner.nextDouble();
                System.out.println("Liczba o przeciwnym znaku do podanej to: " + opposite(f));
                break;

            default:
                System.out.println("Błedny numer działania");
        }

    }

    static double add(double a, double b) {
        return a + b;
    }

    static double absolute(double num) {
        return Math.abs(num);
    }

    static double maxNumber(double c, double d, double e) {
        double maxOfAb = 0;
        if (c > d) {
            maxOfAb = c;
        } else {
            maxOfAb = d;
        }

        return Math.max(maxOfAb, e);
    }

    static double opposite(double f) {
        return -(f);
    }
}
