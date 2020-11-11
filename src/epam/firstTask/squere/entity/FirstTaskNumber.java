package epam.firstTask.squere.entity;

public class FirstTaskNumber {


    private int num;

    public FirstTaskNumber(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "num=" + num;
    }
}
