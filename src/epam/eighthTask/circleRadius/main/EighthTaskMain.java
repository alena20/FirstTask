package epam.eighthTask.circleRadius.main;

import epam.eighthTask.circleRadius.entity.EighthTaskCircle;
import epam.eighthTask.circleRadius.report.EighthTaskReport;

public class EighthTaskMain {

    public static void main(String[] args) {
        EighthTaskCircle R = new EighthTaskCircle(12);
        new EighthTaskReport().printEvenReport(R);
    }
}
