package javapodstawy.algorytmy;

public class Absolute {

    public static int getAbsolute(int number){
        int absolute = 0;
        if (number >= 0){
            absolute = number;
        } else {
            absolute = -number;
        }

        return absolute;
    }

    public static void main(String[] args) {
        System.out.println(getAbsolute(-7));
    }
}
