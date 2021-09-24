package OOPExercises.udemy.Threads.interrupt;

public class InterruptMain {
    public static void main(String[] args) {
        //sleep
        Thread firstThread = new Thread(new RunableThreadWithSleep());
        firstThread.start();

        firstThread.interrupt();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //interrupted
        Thread interruptedThread = new Thread(new RunnableInterruptedThread());
        interruptedThread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        interruptedThread.interrupt();

        //flag
        ThreadWithRunnableFlag threadWithRunnableFlag = new ThreadWithRunnableFlag();
        Thread threadWithFlag = new Thread(threadWithRunnableFlag);
        threadWithFlag.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        threadWithRunnableFlag.stopTheThread();
    }
}
