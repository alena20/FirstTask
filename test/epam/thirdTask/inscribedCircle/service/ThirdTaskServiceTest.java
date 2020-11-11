package epam.thirdTask.inscribedCircle.service;

import epam.thirdTask.inscribedCircle.entity.ThirdTaskSquares;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ThirdTaskServiceTest {

    @Test(description = "Third task count smaller square")
    public void countTimes(){
        ThirdTaskSquares task = new ThirdTaskSquares(64);
        Assert.assertEquals(2,new ThirdTaskService().smallerSquareSmall(task));
    }
}