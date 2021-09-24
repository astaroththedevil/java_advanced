package OOPExercises.udemy.Threads.exercises.task2;

public class TimeCounter implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("I work for " + i + " seconds");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //other way to solve exercise

//    public void run() {
//        int time = 0;
//        while (true) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            time++;
//            System.out.println("It lasts " + time + " seconds");
//        }
//    }
}

