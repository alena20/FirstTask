package epam.sixthTask.points.report;

import epam.sixthTask.points.entity.SixthTaskPoints;
import epam.sixthTask.points.service.SixthTaskService;

import java.util.logging.Logger;

public class SixthTaskReport {
    static final Logger LOGGER = Logger.getLogger("");
    public void printEvenReport(SixthTaskPoints points) {
        SixthTaskService nearOrigin = new SixthTaskService();
        LOGGER.info(nearOrigin.IsNearest(points));
    }
}
