package epam.FifthTask.seconds.main;

import epam.FifthTask.seconds.entity.FifthTaskSecond;
import epam.FifthTask.seconds.report.FifthTaskReport;

public class FifthTaskMain {

    public static void main(String[] args) {
        FifthTaskSecond seconds = new FifthTaskSecond(77356);
        FifthTaskReport report = new FifthTaskReport();
        report.printEvenReport(seconds);
    }
}
