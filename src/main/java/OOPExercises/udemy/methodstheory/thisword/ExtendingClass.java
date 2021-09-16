package OOPExercises.udemy.methodstheory.thisword;

public class ExtendingClass extends BasicClass{

    int x;
    int y;
    int z;
    int v;
    int field;

    ExtendingClass(){
        System.out.println("Constructor from extending class");
    }

    ExtendingClass(int x){
        this.x = x;
        System.out.println("Constructor from extending class with parameter " + x);
    }

    ExtendingClass(int x, int y){
        this(x);
        this.y = y;
        System.out.println("Constructor from extending class with parameters " + x +" " + y);
    }

    void methodFromThisClass(){

    }

    void methodWithParams(int field){
        this.field = field;
    }
}
