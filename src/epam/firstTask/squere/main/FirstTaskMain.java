package epam.firstTask.squere.main;


import epam.firstTask.squere.entity.FirstTaskNumber;
import epam.firstTask.squere.report.FirstTaskReport;
import epam.firstTask.squere.service.FirstTaskService;

public class FirstTaskMain {
    public static void main(String[] args) {
        FirstTaskNumber num = new FirstTaskNumber(55);
        FirstTaskService service = new FirstTaskService();
        int lastNum = service.lastNumber(num);
        FirstTaskReport report = new FirstTaskReport();
        report.printEvenReport(lastNum,num);
    }
}
