package OOPExercises.udemy.methodstheory.classesandmethods;

public class ClassForMethods {

    void voidMethod(){
        System.out.println("Some text from this method");
    }

    void voidMethodWithArgument(int number, char sign){
        number++;
        System.out.println("Value of the method " + number + sign);
    }

    void voidAnotherMethod(boolean shouldShow, int number){
        if(shouldShow){
            System.out.println("Number " + number);
        } else {
            System.out.println("Don't show number");
        }
    }

    int sumNums(int a, int b){
        int result = a +b;
        return result;
    }

    double sumDoubles(double num){
        double result = num + 0.77;
        return result;
    }

    boolean changeValue(boolean value){
        return !value;
    }

    int returnValue(boolean shouldReturn, int num){
        if(shouldReturn){
            return num;
        } else {
            return 0;
        }
    }


}
