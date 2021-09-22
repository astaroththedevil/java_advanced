package OOPExercises.udemy.classestheory.anonymousclasses;

public class AnonymousMain {
    public static void main(String[] args) {

        AnonymousClass anonymousClass = new AnonymousClass(){
            @Override
            public void commonMethod(){
                System.out.println("Method invoked from anonymous class");
            }
        };
        anonymousClass.commonMethod();

        AnonymousClass anonymousClass1 = new AnonymousClass();
        methodFromHere(new AnonymousClass(){
            @Override
            public void commonMethod(){
                System.out.println("Changed behavior of commonMethod overrided in AnonymousClass");
            }
        });
    }

    public static void methodFromHere(AnonymousClass parameter){
        parameter.commonMethod();
    }
}
