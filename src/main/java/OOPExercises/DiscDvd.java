package OOPExercises;

public class DiscDvd {

    //fields
    private String producer;
    private int capacity;
    private boolean isAudio;

    public DiscDvd(String producer, int capacity, boolean isAudio) {
        this.producer = producer;
        this.capacity = capacity;
        this.isAudio = isAudio;
    }

    public DiscDvd(String producer, int capacity) {
        this.producer = producer;
        this.capacity = capacity;
    }

    public DiscDvd(int capacity) {
        this.capacity = capacity;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isAudio() {
        return isAudio;
    }

    public void setAudio(boolean audio) {
        isAudio = audio;
    }

    public void play () {
        if (isAudio) {
            System.out.println("Playing...");
        } else {
            System.out.println("Disk is invalid");
        }
    }

    @Override
    public String toString() {
        return "DiscDvd{" +
                "producer='" + producer + '\'' +
                ", capacity=" + capacity +
                ", isAudio=" + isAudio +
                '}';
    }
}
