package OOPExercises.udemy.Threads.exercises.task1;

public class Main {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread in anonymous class");
            }
        });
        thread.start();
    }
}
