package javapodstawy.metody;

public class MethodsExample {

    public static void main(String[] args) {

        int x = 5;
        insaneMethod(x);
        insaneMethod(3);

        int returnedValue = methodToAlwaysReturn1();
        System.out.println(returnedValue);
    }

    static void insaneMethod(int param) {
        System.out.println("I'm insane. " + param);
    }

    static int methodToAlwaysReturn1() {
        return 1;
    }
}

