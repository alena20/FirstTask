package epam.thirdTask.inscribedCircle.report;

import epam.thirdTask.inscribedCircle.entity.ThirdTaskSquares;
import epam.thirdTask.inscribedCircle.service.ThirdTaskService;

import java.util.logging.Logger;

public class ThirdTaskReport {
    static final Logger LOGGER = Logger.getLogger("");
    public void printEvenReport(ThirdTaskSquares squareS) {
        ThirdTaskService compare = new ThirdTaskService();
        LOGGER.info("Large square area "+ squareS.getSquareS()+ " and it's greater then  small square area is "
                + compare.smallerSquareSmall(squareS)+ " times ");
    }
}
