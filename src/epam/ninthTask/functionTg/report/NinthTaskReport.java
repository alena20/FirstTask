package epam.ninthTask.functionTg.report;

import epam.ninthTask.functionTg.entity.NineTaskFunc;
import epam.ninthTask.functionTg.service.NinthTaskService;

import java.util.logging.Logger;

public class NinthTaskReport {

    static final Logger LOGGER = Logger.getLogger("");
    public void printEvenReport(NineTaskFunc task) {
        NinthTaskService table = new NinthTaskService();
        LOGGER.info(table.func(task).toString());
    }
}
