package OOPExercises.udemy.Threads.exercises.task2;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new TimeCounter());
        thread.start();
    }
}
