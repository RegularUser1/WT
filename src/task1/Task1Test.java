package task1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Task1Test {

    @Test
    void calculateFunction() {
        double expected = Task1.calculateFunction(3,4);
        double actual = 3.288;
        Assert.assertEquals(expected,actual,0.01);
    }
}