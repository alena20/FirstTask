package epam.eighthTask.circleRadius.service;

import epam.eighthTask.circleRadius.entity.EighthTaskCircle;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EighthTaskServiceTest {

    @Test(description = "Eighth task square and length of circle are correct")
    public void IsEquals() {
        EighthTaskCircle R = new EighthTaskCircle(10);
        assertEquals(new EighthTaskService().lengthSquare(R),"square of circle is 314.0 and length of circle is 62.800000000000004");
    }
}