package OOPExercises.udemy.Threads.interrupt;

public class RunableThreadWithSleep implements Runnable {

    //Stopping thread - two ways:
//    @Override
////    public void run() {
////        while(true){
////            System.out.println("Sleep thread");
////            try {
////                Thread.sleep(1000);
////            } catch (InterruptedException e) {
////                e.printStackTrace();
////                System.out.println("Exception in sleep");
////                return;
////            }
////        }
////    }
    // or

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Sleep thread");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Exception in sleep");
        }
    }
}
