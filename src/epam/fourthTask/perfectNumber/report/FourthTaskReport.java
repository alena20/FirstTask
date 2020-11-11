package epam.fourthTask.perfectNumber.report;

import epam.fourthTask.perfectNumber.entity.FourthTaskNumber;
import epam.fourthTask.perfectNumber.service.FourthTaskService;
import epam.thirdTask.inscribedCircle.entity.ThirdTaskSquares;

import java.util.logging.Logger;

public class FourthTaskReport {
    static final Logger LOGGER = Logger.getLogger("");
    public void printEvenReport(FourthTaskNumber num) {
        FourthTaskService service = new FourthTaskService();
        String isPerfect = service.IsPerfectNum(num) ? "perfect - true" : "not perfect - false";
        LOGGER.info(num.toString() + " is " + isPerfect);
    }
}
