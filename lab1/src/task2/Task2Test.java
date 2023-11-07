package task2;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Task2Test {

    @Test
    void checkAllArrea() {
        boolean expected = Task2.checkAllArrea(2,3);
        Assert.assertEquals(expected,true);
        expected = Task2.checkAllArrea(10,100);
        Assert.assertEquals(expected,false);
        expected = Task2.checkAllArrea(-4,-2);
        Assert.assertEquals(expected,true);
    }
}