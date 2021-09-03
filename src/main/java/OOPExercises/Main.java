package OOPExercises;

public class Main {
    public static void main(String[] args) {

        DiscDvd newDisk = new DiscDvd("Sony", 4700, true);
        System.out.println(newDisk);

        newDisk.play();
    }
}
