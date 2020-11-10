package edu.epam.numbers.service;

import edu.epam.numbers.entity.FirstTaskNumber;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FirstTaskServiceTest {
    @Test(description = "First task")
    public void lastNuberOfSquere(){
        FirstTaskNumber num = new FirstTaskNumber(55);
        FirstTaskService service = new FirstTaskService();
        int lastNum = service.lastNumber(num);
        Assert.assertEquals(5, lastNum);
    }
}