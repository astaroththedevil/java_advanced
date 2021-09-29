package OOPExercises.udemy.classestheory.interfaces.interface_extends_default_static_final_methods;

public interface Flying {
    public static final float DEFAULT_WINGSPAN = 0.7f;
    public void fly();

    public default void flyHigher(){
        System.out.println("Flying higher");
    }

    public default float getWIngspan(){
        return Flying.DEFAULT_WINGSPAN;
    }

    public static int getDefaultNumWings(){
        return 2;
    }
}
