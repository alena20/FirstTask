package epam.SeventhTask.service;

import epam.SeventhTask.entity.SeventhTaskXNumber;

public class SeventhTaskService {

    public double function(SeventhTaskXNumber x) {
        return x.getX() >= 3 ? (-1 * (x.getX() * x.getX()) + 3 * x.getX() + 9) : 1 / (Math.pow(x.getX(), 3) - 6);
    }
}
