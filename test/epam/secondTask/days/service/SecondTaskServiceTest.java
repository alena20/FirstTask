package epam.secondTask.days.service;
import epam.secondTask.days.entity.SecondTaskYear;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SecondTaskServiceTest {

    @Test(description = "Second task count days")
    public void countDays(){
        SecondTaskYear task = new SecondTaskYear(2021,2);
        SecondTaskService service = new SecondTaskService();
        Assert.assertEquals(28, service.CountDays(task));
    }

    @Test(description = "Second task is leap year")
    public void leapYear(){
        SecondTaskYear task = new SecondTaskYear(2020,2);
        SecondTaskService service = new SecondTaskService();
        Assert.assertTrue(service.IsLeapYear(task));
    }
}