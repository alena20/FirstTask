package edu.epam.numbers.entity;

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
        return "FirstTaskNumber{" +
                "num=" + num +
                '}';
    }
}
