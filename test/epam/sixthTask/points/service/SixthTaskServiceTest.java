package epam.sixthTask.points.service;

import epam.sixthTask.points.entity.SixthTaskPoints;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

import static org.testng.Assert.*;

public class SixthTaskServiceTest {

    @Test(description = "Sixth task correct output nearest point a")
    public void IsNearestA() {
        SixthTaskPoints poi = new SixthTaskPoints(new Point(1,3), new Point(2,7));
        Assert.assertEquals(new SixthTaskService().IsNearest(poi),"point A is nearest");
    }

    @Test(description = "Sixth task correct output nearest point b")
    public void IsNearest() {
        SixthTaskPoints poi = new SixthTaskPoints(new Point(5,6), new Point(3,4));
        Assert.assertEquals(new SixthTaskService().IsNearest(poi),"point B is nearest");
    }

    @Test(description = "Sixth task equidistant")
    public void equidistant() {
        SixthTaskPoints poi = new SixthTaskPoints(new Point(1,1), new Point(1,1));
        Assert.assertEquals(new SixthTaskService().IsNearest(poi),"points are equidistant from the origin");
    }

}