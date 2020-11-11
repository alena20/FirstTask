package epam.secondTask.days.main;


import epam.secondTask.days.entity.SecondTaskYear;
import epam.secondTask.days.report.SecondTaskReport;

public class SecondTaskMain {
    public static void main(String[] args) {
        SecondTaskYear task = new SecondTaskYear(2020,2);
        SecondTaskReport report = new SecondTaskReport();
        report.printEvenReport(task);
    }
}
