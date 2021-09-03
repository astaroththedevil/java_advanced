package javapodstawy.operatorylogiczne;

public class Exs {

    public static void main(String[] args) {

        int a = 7;
        int b = 13;

        if (a == b){
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Numbers aren't equal");
        }

        System.out.println("-----------------------------------------------------------");

        int c = 12;

        if(c >= 0 && c <= 10 && c+1 >= 0 && c+1 <= 10 && c % 2 == 0){
            System.out.println("Number fits to all conditions");
        } else {
            System.out.println("Number doesn't fit to all conditions");
        }

        System.out.println("-----------------------------------------------------------");

        int d = 7;

        if(d >= 0 && d <= 10 && d+1 >= 0 && d+1 <= 10 && d % 2 != 0){
            System.out.println("Number fits to all conditions");
        } else {
            System.out.println("Number doesn't fit to all conditions");
        }

        System.out.println("-----------------------------------------------------------");

        char letter = '!';

        if (letter >= 'a' && letter <= 'z'){
            System.out.println("Given letter is between a and z");
        } else {
            System.out.println("Given letter isn't between a and z");
        }

        System.out.println("-----------------------------------------------------------");

        char anotherLetter = ';';

        if (!(anotherLetter >= 'a' && anotherLetter <= 'z')){
            System.out.println("Given sign isn't a letter");
        } else {
            System.out.println("Given sign is a letter");
        }
    }
}