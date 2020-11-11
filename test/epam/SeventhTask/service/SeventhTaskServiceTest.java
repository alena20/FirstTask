package epam.SeventhTask.service;

import epam.SeventhTask.entity.SeventhTaskXNumber;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeventhTaskServiceTest {

    @Test(description = "Seventh task function -x^2+3x+9 if x>=3")
    public void IsTrueFirstFunc() {
        SeventhTaskXNumber x = new SeventhTaskXNumber(7);
        Assert.assertEquals(new SeventhTaskService().function(x),-19.0);
    }

    @Test(description = "Seventh task function 1/(x^3-6) if x<3")
    public void IsTrueSecondFunc() {
        SeventhTaskXNumber x = new SeventhTaskXNumber(2);
        Assert.assertEquals(new SeventhTaskService().function(x),0.5);
    }
}