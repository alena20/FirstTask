package epam.firstTask.squere.report;

import epam.firstTask.squere.entity.FirstTaskNumber;

import java.util.logging.Logger;

public class FirstTaskReport{
    static final Logger LOGGER = Logger.getLogger("");
    public void printEvenReport(int lastNum, FirstTaskNumber num) {
        //System.out.println(lastNum + " ..is the last number of square.. " + num);
        LOGGER.info(lastNum + " ..is the last number of square.. " + num);
    }
}
