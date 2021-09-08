package OOPExercises;

import java.util.Arrays;
import java.util.Random;

public class MethodsForStringExercises {

    //-------------------------------METHODS-----------------------------------

    public static String deleteSequence(String givenText, String givenSequence) {
        return givenText.replace(givenSequence, "");
    }

    public static int numberOfWords(String givenText) {
        int counter = 0;
        String[] words = givenText.split(" ");
        for (String word : words) {
            counter++;
        }
        return counter;
    }

    public static void telegram(String givenText) {
        String reuslt = givenText.replace(",", " STOP")
                .replace(".", " STOP");
        System.out.println(reuslt);
    }

//    public static void randomSmile(String givenText) {
//        String space = " ";
//        String result = new String();
//        Random random = new Random();
//
//        if(givenText.contains(space)){
//
//        }
//    }

    public static String reverse(String input){
        char[] in = input.toCharArray();
        int begin=0;
        int end=in.length-1;
        char temp;
        while(end>begin){
            temp = in[begin];
            in[begin]=in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);
    }

    public static boolean areAnagrams(String string1, String string2){
        String s1 = string1.replace("\\s", "");
        String s2 = string2.replace("\\s", "");
        boolean status = true;
        if(string1.length() != string2.length()){
            status = false;
        }else {
            char [] ArrayString1 = string1.toLowerCase().toCharArray();
            char [] ArrayString2 = string2.toLowerCase().toCharArray();
            Arrays.sort(ArrayString1);
            Arrays.sort(ArrayString2);
            status = Arrays.equals(ArrayString1, ArrayString2);
        }
        return status;
    }


    //---------------------------INVOKING METHODS-------------------------------
    public static void main(String[] args) {

        String givenText = "ten i tamten zwierz jest jak tamten jeż";
        String givenSequence = "ten";
        System.out.println(deleteSequence(givenText, givenSequence));
        System.out.println("-------------------------------------------------------------------");

        System.out.println(numberOfWords(givenText));
        System.out.println("-------------------------------------------------------------------");

        String forTelegram = "A regular expression defines a search pattern for strings. Pattern is a compiled representation of a regular expression. Matcher is an engine that interprets the pattern and performs match operations against an input string. Matcher has methods such as find, matches, end to perform matching operations. When there is an exception parsing a regular expression, Java throws a PatternSyntaxException.";
        MethodsForStringExercises.telegram(forTelegram);
        System.out.println("-------------------------------------------------------------------");

        System.out.println(reverse(forTelegram));
        System.out.println("-------------------------------------------------------------------");

        System.out.println(areAnagrams("Keep peek", "Peek keep"));
        System.out.println("-------------------------------------------------------------------");


    }
}
