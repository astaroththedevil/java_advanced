package OOPExercises.udemy.Threads.runnable;

public class RunnableMain {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread());
        thread.start();

        // Above: making threads in anonymous class
        Thread nextThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 1000; i++){
                    System.out.println("Thread in anonymous class: " + i);
                }
            }
        });
        nextThread.start();

        // another way to create thread when it should be used once
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 1000; i++){
                    System.out.println("Thread in anonymous class without assigning to variable: " + i);
                }
            }
        }).start();
    }
}
