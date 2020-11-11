package epam.FifthTask.seconds.service;

import epam.FifthTask.seconds.entity.FifthTaskSecond;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FifthTaskServiceTest {

    @Test(description = "Fifth task correct output")
    public void IsEquals(){
        FifthTaskSecond sec = new FifthTaskSecond(55123);
        Assert.assertEquals(new FifthTaskService().hoursMinutes(sec),"hour 15 minute 18 second 43");
    }

}