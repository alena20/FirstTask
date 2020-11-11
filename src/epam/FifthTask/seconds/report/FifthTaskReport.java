package epam.FifthTask.seconds.report;

import epam.FifthTask.seconds.entity.FifthTaskSecond;
import epam.FifthTask.seconds.service.FifthTaskService;

import java.util.logging.Logger;

public class FifthTaskReport {
    static final Logger LOGGER = Logger.getLogger("");
    public void printEvenReport(FifthTaskSecond sec) {
        FifthTaskService hours = new FifthTaskService();
        LOGGER.info(hours.hoursMinutes(sec));
    }
}
