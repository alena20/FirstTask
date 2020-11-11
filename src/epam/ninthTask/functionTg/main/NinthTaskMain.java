package epam.ninthTask.functionTg.main;

import epam.ninthTask.functionTg.entity.NineTaskFunc;
import epam.ninthTask.functionTg.report.NinthTaskReport;

public class NinthTaskMain {

    public static void main(String[] args) {
        NineTaskFunc task = new NineTaskFunc(1,8,1.5);
        new NinthTaskReport().printEvenReport(task);
    }
}
