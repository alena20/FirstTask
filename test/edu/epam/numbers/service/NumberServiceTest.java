package edu.epam.numbers.service;

import edu.epam.numbers.entity.NumberArray;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberServiceTest {
    @Test(description = "")
    public void isTwoEvenNumbersTrue() {
        NumberArray array = new NumberArray(34, 55, 65, 44);
        NumberService service = new NumberService();
        boolean condition = service.isTwoEvenNumbers(array);
        assertTrue(condition);
    }
    @Test(description = "")
    public void isTwoEvenNumbersFalse() {
        NumberArray array = new NumberArray(33, 55, 65, 44);
        NumberService service = new NumberService();
        boolean condition = service.isTwoEvenNumbers(array);
        assertFalse(condition);
    }
}