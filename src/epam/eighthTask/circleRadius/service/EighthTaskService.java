package epam.eighthTask.circleRadius.service;

import epam.eighthTask.circleRadius.entity.EighthTaskCircle;

public class EighthTaskService {
    static final double pi = 3.14;

    public String lengthSquare(EighthTaskCircle R){
        double square = pi* Math.pow(R.getR(),2);
        double length = 2*pi* R.getR();
        return "square of circle is "+square+" and length of circle is "+length;
    }
}
