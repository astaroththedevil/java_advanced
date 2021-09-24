package OOPExercises.udemy.Threads.interrupt;

public class RunnableInterruptedThread implements Runnable {

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            System.out.println("Interrupted thread working");
        }
        System.out.println("Finished work cause of interrupted()");
    }
}
