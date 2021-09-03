package javapodstawy.petle;

public class Ex2 {

    public static void main(String[] args) {

        System.out.println(getSumOfRange(1, 100));
        System.out.println(circlearea(3));
        System.out.println(perpendicularLength(3, 4));
        System.out.println(isPrime(7));
        System.out.println(sumOfArithmeticSeries(2, 4, 7));

    }

    public static long getSumOfRange(long lower, long upper){
        long sum = 0;
        for(long i=lower;i<=upper; i++){
            sum += i;
        }
        return sum;
    }

    public static double circlearea(double radius){
        return Math.round(2 * Math.PI * radius);
    }

    public static double perpendicularLength(double a, double b){
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public static boolean isPrime(int number){
        boolean prime = false;
        for (int i = 2; i <= number / 2; i++){
            if (!(number % i == 0)){
                prime = true;
            }
        }
        return prime;
    }

    public static double sumOfArithmeticSeries(double a, double b, double n){
        double sum = 0;
        for(int i = 0; i < n; i++){
            sum += a;
            a = a + b;
        }
        return sum;
    }

    Object arr [] = new Object[4];
}
