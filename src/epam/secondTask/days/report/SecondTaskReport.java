package epam.secondTask.days.report;

import epam.secondTask.days.entity.SecondTaskYear;
import epam.secondTask.days.service.SecondTaskService;

import java.util.logging.Logger;

public class SecondTaskReport {
    static final Logger LOGGER = Logger.getLogger("");
    SecondTaskService days = new SecondTaskService();
    public void printEvenReport(SecondTaskYear task) {
        //System.out.println(lastNum + " ..is the last number of square.. " + num);
        LOGGER.info("year "+task.getYear() + " month " + task.getMonth()+ " have "+ days.CountDays(task) + " days");
    }
}
