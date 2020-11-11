package epam.SeventhTask.report;

import epam.SeventhTask.entity.SeventhTaskXNumber;
import epam.SeventhTask.service.SeventhTaskService;

import java.util.logging.Logger;

public class SeventhTaskReport {

    static final Logger LOGGER = Logger.getLogger("");
    public void printEvenReport(SeventhTaskXNumber x) {
        SeventhTaskService functionResult = new SeventhTaskService();
        LOGGER.info("function result is "+functionResult.function(x));
    }
}
