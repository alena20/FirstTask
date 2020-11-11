package epam.sixthTask.points.main;

import epam.sixthTask.points.entity.SixthTaskPoints;
import epam.sixthTask.points.report.SixthTaskReport;

import java.awt.*;

public class SixthTaskMain {
    public static void main(String[] args) {
        SixthTaskPoints points = new SixthTaskPoints(new Point(1,3),new Point(2,7));
        SixthTaskReport report = new SixthTaskReport();
        report.printEvenReport(points);
    }
}
