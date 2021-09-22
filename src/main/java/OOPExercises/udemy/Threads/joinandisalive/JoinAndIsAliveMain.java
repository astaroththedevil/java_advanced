package OOPExercises.udemy.Threads.joinandisalive;

public class JoinAndIsAliveMain {
    public static void main(String[] args) {
        System.out.println("Start");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 4; i++){
                    System.out.println("Hard working...");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();

        System.out.println("(Before join) Is thread alive: " + thread.isAlive());

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("(After join) Is thread alive: " + thread.isAlive());

        System.out.println("Stop");
    }
}
