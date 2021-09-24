package OOPExercises.udemy.Threads.exercises.task3;

public class ThreadsRace {
    public static void main(String[] args) {

        Thread firstThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 1000; i++){
                    System.out.println("First: I will be first!");
                }
                System.out.println("I finished - First Thread");
            }
        });

        Thread secondThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 1000; i++){
                    System.out.println("Second: I will be first!");
                }
                System.out.println("I finished - Second Thread");
            }
        });

        firstThread.start();
        secondThread.start();
    }
}
