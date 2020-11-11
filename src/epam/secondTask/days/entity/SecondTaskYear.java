package epam.secondTask.days.entity;

public class SecondTaskYear {

    private int year, month;

    public SecondTaskYear(int year, int month) {
        this.year = year;
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month > 0 ? month : 0;
    }

    public void setMonth(int month) {
        this.month = month;
    }


    @Override
    public String toString() {
        return "year=" + year +
                ", month=" + month;
    }
}
