package OOPExercises.udemy.paradigmsOOP.summary;

public abstract class SamsungTV implements TVset {
    private boolean isOn = false;
    private int chanNum = 1;
    private int diagonal;

    protected SamsungTV (int diagonal){
        this.diagonal = diagonal;
    }

    @Override
    public void on() {
        isOn = true;
        System.out.println("SAMSUNG TV");
        display();
    }

    @Override
    public void off() {
        System.out.println("Off animation");
        isOn = false;
    }

    @Override
    public void switchChannel(int num) {
        if(isOn){
        chanNum = num;
        }
    }

    private void display() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (isOn) {
                    try {
                        System.out.println("Display screen: " + chanNum);
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
