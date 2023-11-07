package task5;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Task5Test {

    @Test
    void howManyDelete() {
        int expected = Task5.howManyDelete(new int[]{1,2,7,1,3,7,9,0,1});
        int actual = 4;
        Assert.assertEquals(expected,actual);
    }
}