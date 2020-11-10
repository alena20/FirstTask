package edu.epam.numbers.main;


import edu.epam.numbers.entity.FirstTaskNumber;
import edu.epam.numbers.report.FirstTaskReport;
import edu.epam.numbers.service.FirstTaskService;

public class FirstTaskMain {
    public static void main(String[] args) {
        FirstTaskNumber num = new FirstTaskNumber(55);
        FirstTaskService service = new FirstTaskService();
        int lastNum = service.lastNumber(num);
        FirstTaskReport report = new FirstTaskReport();
        report.printEvenReport(lastNum,num);
    }
}
