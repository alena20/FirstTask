package epam.secondTask.days.service;

import epam.firstTask.squere.entity.FirstTaskNumber;
import epam.firstTask.squere.service.FirstTaskService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTaskServiceTest {
    @Test(description = "First task")
    public void lastNumberOfSquare(){
        FirstTaskNumber num = new FirstTaskNumber(55);
        FirstTaskService service = new FirstTaskService();
        int lastNum = service.lastNumber(num);
        Assert.assertEquals(5, lastNum);
    }
}