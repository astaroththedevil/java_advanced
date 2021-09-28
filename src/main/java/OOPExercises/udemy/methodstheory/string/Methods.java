package OOPExercises.udemy.methodstheory.string;

public class Methods {
    public static void main(String[] args) {

        //lastIndexOf
        String str = "One two three four. One two";

        int index = str.lastIndexOf("One");
        System.out.println("Last index of " + index);
        String partial = str.substring(index);
        System.out.println(partial);

        index = str.indexOf("One");
        System.out.println("First index of " + index);
        System.out.println("-----------------------------------------------");

        //repeat & join
        String string = "Info";
        string = string.repeat(3);
        System.out.println(string);
        System.out.println("---------------------------------------------------");

        String joinedText = String.join(" - ", "One", "Two", "Three");
        System.out.println(joinedText);
        System.out.println("-----------------------------------------------------");

        String text = "Once ".concat("in a ").concat("lifetime.");
        System.out.println(text);
        System.out.println("----------------------------------------");

        //toCharArray, split, toString
        String string2 = "This is some text";
        char[] arr = string2.toCharArray();
        System.out.println("Num of signs " + arr.length);
        System.out.println("-------------------------------------------------------------");

        String strArr[] = string2.split(" ");
        System.out.println(strArr[0]);
        System.out.println("-------------------------------------------------------------");

        //StringBuilder
        StringBuilder builder = new StringBuilder();
        builder.append("This is text.").append(123);
        builder.append(" Another text");

        builder.insert(0, "Added text. ");
        System.out.println(builder.toString());

        builder.replace(0, 5, "Sample");
        System.out.println(builder.toString());

        builder.insert(12, " Inserted text.");
        System.out.println(builder.toString());

        int index2 = builder.indexOf("Another");
        builder.delete(index2, builder.length());
        System.out.println(builder.toString());

    }
}
