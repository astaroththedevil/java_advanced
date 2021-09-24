package OOPExercises.udemy.Threads.doublestart;

public class DoubleStartMain {
    public static void main(String[] args) {
        Thread thread = new Thread(new FirstThread());
        thread.start();

        Thread nextThread = new Thread(new FirstThread());
        nextThread.start();
    }
}
