package epam.fourthTask.perfectNumber.main;

import epam.fourthTask.perfectNumber.entity.FourthTaskNumber;
import epam.fourthTask.perfectNumber.report.FourthTaskReport;
import epam.thirdTask.inscribedCircle.report.ThirdTaskReport;

public class FourthTaskMain {

    public static void main(String[] args) {
        FourthTaskNumber num = new FourthTaskNumber(6);
        FourthTaskReport report = new FourthTaskReport();
        report.printEvenReport(num);
    }
}
