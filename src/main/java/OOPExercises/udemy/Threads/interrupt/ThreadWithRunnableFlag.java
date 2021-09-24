package OOPExercises.udemy.Threads.interrupt;

public class ThreadWithRunnableFlag implements Runnable{

    private boolean threadIsWorking;

    @Override
    public void run() {
        threadIsWorking = true;
        while (threadIsWorking){
            System.out.println("Thread with flag works");
        }
        System.out.println("Thread with flag finished working");
    }

    public void stopTheThread(){
        threadIsWorking = false;
    }
}
