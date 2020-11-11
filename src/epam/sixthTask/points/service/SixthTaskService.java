package epam.sixthTask.points.service;

import epam.sixthTask.points.entity.SixthTaskPoints;

import java.awt.*;

public class SixthTaskService {

    public String IsNearest(SixthTaskPoints poi){
        double pointA = Math.sqrt(poi.getX1().x*poi.getX1().x+poi.getX1().y*poi.getX1().y);
        double pointB = Math.sqrt(poi.getX2().x*poi.getX2().x+poi.getX2().y*poi.getX2().y);
        return pointA!=pointB?(pointA>pointB? "point B is nearest" : "point A is nearest"):"points are equidistant from the origin";
    }
}
