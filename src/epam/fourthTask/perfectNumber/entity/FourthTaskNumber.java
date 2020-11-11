package epam.fourthTask.perfectNumber.entity;

public class FourthTaskNumber {
    private int number;


    public FourthTaskNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Initial number= "+ number+" ";
    }
}
