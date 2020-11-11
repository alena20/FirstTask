package epam.ninthTask.functionTg.service;

import epam.ninthTask.functionTg.entity.NineTaskFunc;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NinthTaskServiceTest {

    @Test(description = "Ninth task function")
    public void IsTrueFirstFunc() {
        NineTaskFunc task = new NineTaskFunc(1,8,1.5);
        StringBuilder sb = new StringBuilder();
        sb.append("Argument: 1.0\t");
        sb.append("F(x)= 1.5574077246549023\r\n");
        sb.append("Argument: 2.5\t");
        sb.append("F(x)= -0.7470222972386603\r\n");
        sb.append("Argument: 4.0\t");
        sb.append("F(x)= 1.1578212823495775\r\n");
        sb.append("Argument: 5.5\t");
        sb.append("F(x)= -0.995584052213885\r\n");
        sb.append("Argument: 7.0\t");
        sb.append("F(x)= 0.8714479827243188\r\n");
        Assert.assertEquals(new NinthTaskService().func(task).toString(),sb.toString());
    }
}