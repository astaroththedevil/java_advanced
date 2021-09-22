package OOPExercises.udemy.Threads.basic;

public class FirstThread extends Thread{

    //method run must be overrided!!!
    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++){
            System.out.println("First thread: " + i);
        }
    }
}
