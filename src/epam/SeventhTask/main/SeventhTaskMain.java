package epam.SeventhTask.main;

import epam.SeventhTask.entity.SeventhTaskXNumber;
import epam.SeventhTask.report.SeventhTaskReport;

public class SeventhTaskMain {

    public static void main(String[] args) {
        SeventhTaskXNumber x = new SeventhTaskXNumber(1);
        SeventhTaskReport report = new SeventhTaskReport();
        report.printEvenReport(x);
    }
}
