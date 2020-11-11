package epam.eighthTask.circleRadius.report;

import epam.eighthTask.circleRadius.entity.EighthTaskCircle;
import epam.eighthTask.circleRadius.service.EighthTaskService;

import java.util.logging.Logger;

public class EighthTaskReport {
    static final Logger LOGGER = Logger.getLogger("");
    public void printEvenReport(EighthTaskCircle R) {
        LOGGER.info(new EighthTaskService().lengthSquare(R));
    }
}
