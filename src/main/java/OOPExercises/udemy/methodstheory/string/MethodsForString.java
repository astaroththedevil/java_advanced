package OOPExercises.udemy.methodstheory.string;

import java.util.Locale;

public class MethodsForString {
    public static void main(String[] args) {

        String string1 = "abc";
        String string2 = "abcdef";


        //----------------------String methods---------------------------

        System.out.println("equals() method:");
        System.out.println(string1.equals(string2));
        System.out.println("--------------------------------------------------------------");

        System.out.println("contains() method:");
        System.out.println(string2.contains(string1));
        System.out.println("--------------------------------------------------------------");

        System.out.println("indexOf() method:");
        System.out.println(string2.indexOf('b'));
        System.out.println("--------------------------------------------------------------");

        System.out.println("charAt() method:");
        System.out.println(string2.charAt(4));
        System.out.println("--------------------------------------------------------------");

        System.out.println("length() method:");
        System.out.println(string1.length());
        System.out.println("--------------------------------------------------------------");

        System.out.println("compareTo() & compareToIgnorCase() methods:");
        String string3 = "ABC";
        String string4 = "abc";
        System.out.println(string3.compareTo(string4));
        System.out.println(string1.compareTo(string4));
        System.out.println(string3.compareToIgnoreCase(string4));
        System.out.println(string2.compareToIgnoreCase(string4));
        System.out.println("--------------------------------------------------------------");

        System.out.println("concat() method:");
        System.out.println(string3.concat(string4));
        System.out.println(string3.concat(string4).concat("something"));
        string1.concat(string2).concat("Another something"); //concat doesn't create new String! Proven in line below.
        System.out.println(string1);
        System.out.println("--------------------------------------------------------------");

        System.out.println("replace() & replaceFirst() methods:");
        String replace = string1.replace("ab", "zx");
        System.out.println(replace);
        String string5 = "This is some text\nThis is some text";
        String replace2 = string5.replaceFirst("T", "t");
        System.out.println(replace2);
        System.out.println("--------------------------------------------------------------");

        System.out.println("substring() method:");
        String substring = string2.substring(2, 4);
        System.out.println(substring);
        String substring2 = string5.substring(21);
        System.out.println(substring2);
        System.out.println("--------------------------------------------------------------");

        System.out.println("split() method:");
        String string6 = "ab, cd, ef, gh";
        String[] words = string6.split(", ");
        for(String word : words){
            System.out.println(word);
        }
        System.out.println(words); //array is an object so this line prints reference to object in machine memory!
        System.out.println("--------------------------------------------------------------");

        System.out.println("toCharArray() method:");
        char chars[] = string2.toCharArray();
        System.out.println(chars);
        System.out.println("--------------------------------------------------------------");

        System.out.println("trim() method:");
        String string7 = "    abc def   ghi  \n";
        String trimmed = string7.trim();
        System.out.println(trimmed);
        System.out.println("--------------------------------------------------------------");

        System.out.println("toLowerCase() & toUpperCase() methods:");
        String string8 = "sdfaAsdFAsgaSFgasdfGSDG";
        System.out.println(string8.toLowerCase());
        System.out.println(string8.toUpperCase());
        System.out.println("--------------------------------------------------------------");

        System.out.println("isEmpty() method:");
        String string9 = "dasfasd asdf as as ";
        String string10 = " ";
        String string11 = "";
//        String string12 = null; Cannot invoke "String.isEmpty()" because "string12" is null - NullPointerException
        System.out.println(string9.isEmpty());
        System.out.println(string10.isEmpty());
        System.out.println(string11.isEmpty());
//        System.out.println(string12.isEmpty());
        System.out.println("--------------------------------------------------------------");

        System.out.println("valueOf() method");
        String doubleStr = String.valueOf(1.234);
        String booleanStr = String.valueOf(true);
        String charTableStr = String.valueOf(new char[]{'a', 'b', 'c'});
        System.out.println(doubleStr);
        System.out.println(booleanStr);
        System.out.println(charTableStr);
        System.out.println("--------------------------------------------------------------");

        System.out.println("fluent interface");
        String result = "  strang"
                .replace("a", "i")
                .concat("!")
                .toUpperCase()
                .trim();
        System.out.println(result);
        System.out.println("--------------------------------------------------------------");

        System.out.println("typy opakowane");
        Integer i = 1;
        Integer i2 = Integer.parseInt("123");
        double d = i.doubleValue();

        boolean b = Boolean.parseBoolean("true");
        System.out.println(i);
        System.out.println(i2);
        System.out.println(d);
        System.out.println(b);
        System.out.println("--------------------------------------------------------------");

    }
}



