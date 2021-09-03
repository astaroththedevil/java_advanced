package javapodstawy.algorytmy;

public class Power {
    public static double power(double number, double numberOfPower){
        double result = 0;
        return Math.pow(number, numberOfPower);
    }

    public static void main(String[] args) {
        System.out.println(power(3, 7));
    }
}
