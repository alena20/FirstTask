package epam.fourthTask.perfectNumber.service;

import epam.fourthTask.perfectNumber.entity.FourthTaskNumber;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FourthTaskServiceTest {

    @Test(description = "Fourth task perfect number")
    public void isFalsePerfect() {
        FourthTaskNumber num = new FourthTaskNumber(29);
        Assert.assertFalse(new FourthTaskService().IsPerfectNum(num));
    }

    @Test(description = "Fourth task perfect number")
    public void isTruePerfect() {
        FourthTaskNumber num = new FourthTaskNumber(6);
        Assert.assertTrue(new FourthTaskService().IsPerfectNum(num));
    }
}