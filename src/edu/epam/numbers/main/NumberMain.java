package edu.epam.numbers.main;

import edu.epam.numbers.entity.NumberArray;
import edu.epam.numbers.report.NumberReport;
import edu.epam.numbers.service.NumberService;

public class NumberMain {
    public static void main(String[] args) {
        NumberArray array = new NumberArray(33, 55, 65, 44);
        NumberService service = new NumberService();
        boolean result = service.isTwoEvenNumbers(array);
        NumberReport report = new NumberReport();
        report.printEvenReport(result, array);
    }
}
