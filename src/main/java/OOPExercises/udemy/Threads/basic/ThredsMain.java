package OOPExercises.udemy.Threads.basic;

public class ThredsMain {
    public static void main(String[] args) {

        Thread firstThread = new FirstThread();
        Thread secondThread = new SecondThread();

        firstThread.start();
        secondThread.start();
    }
}
