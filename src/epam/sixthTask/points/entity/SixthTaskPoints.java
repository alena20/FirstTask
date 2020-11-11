package epam.sixthTask.points.entity;

import java.awt.*;

public class SixthTaskPoints {

    private Point x1;
    private Point x2;

    public SixthTaskPoints(Point x1, Point x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public Point getX1() {
        return x1;
    }

    public void setX1(Point x1) {
        this.x1 = x1;
    }

    public Point getX2() {
        return x2;
    }

    public void setX2(Point x2) {
        this.x2 = x2;
    }

    @Override
    public String toString() {
        return "SixthTaskPoints{" +
                "x1=" + x1 +
                ", x2=" + x2 +
                '}';
    }
}
