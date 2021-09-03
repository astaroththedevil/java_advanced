package javapodstawy.metody;

public class Exs {
    public static void main(String[] args) {

        System.out.println(alwaysTheSameMessage());
        signByAscii((char)232);
        System.out.println(add(5, 7));
        double num = 2.0d;
        double pow = 3.0d;
        System.out.println((int)thirdPower(num, pow));
        System.out.println(isEqual(7, 6));
        System.out.println(isDivisible(9, 3));
        System.out.println(areEqualAsciiToSign('A', 66));
        System.out.println(alwaysTheSameMessage(5));
        System.out.println(add(7, 5, 4));


    }

    static String alwaysTheSameMessage() {
        return "Always the same message";
    }

    static String alwaysTheSameMessage(int a){
        return "Always the same message " + a;
    }

    static void signByAscii(char ascii){
        System.out.println(ascii);
    }

    static int add (int a, int b){
        return a + b;
    }

    static int add (int a, int b, int c){
        return a + b +c;
    }

    static double thirdPower (double a, double pow){
        return Math.pow(a, pow);
    }

    static boolean isEqual (int a, int b){
        return a == b;
    }

    static boolean isDivisible (int a, int b){
        return a % b == 0;
    }

    static boolean areEqualAsciiToSign (char givenSign, int number){
        return givenSign == (char)number;
    }


}
