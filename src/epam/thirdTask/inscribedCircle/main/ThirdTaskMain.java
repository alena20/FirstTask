package epam.thirdTask.inscribedCircle.main;

import epam.thirdTask.inscribedCircle.entity.ThirdTaskSquares;
import epam.thirdTask.inscribedCircle.report.ThirdTaskReport;
import epam.thirdTask.inscribedCircle.service.ThirdTaskService;

public class ThirdTaskMain {
    public static void main(String[] args) {
        ThirdTaskSquares squareS = new ThirdTaskSquares(36);
        ThirdTaskReport report = new ThirdTaskReport();
        report.printEvenReport(squareS);
    }
}
