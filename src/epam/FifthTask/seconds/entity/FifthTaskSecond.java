package epam.FifthTask.seconds.entity;

public class FifthTaskSecond {

    private int seconds;

    public FifthTaskSecond(int seconds) {
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds>0?seconds:0;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return "Initial seconds = "  + seconds;
    }
}
