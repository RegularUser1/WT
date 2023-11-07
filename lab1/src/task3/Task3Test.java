package task3;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Task3Test {

    @Test
    void generateTanTable() {
        String expected = Task3.generateTanTable(1,3,0.2);
        String actual = "\n|   x   |   y   |\n" +
                "| 1,000 | 1,557 |\n" +
                "| 1,200 | 2,572 |\n" +
                "| 1,400 | 5,798 |\n" +
                "| 1,600 | -34,233 |\n" +
                "| 1,800 | -4,286 |\n" +
                "| 2,000 | -2,185 |\n" +
                "| 2,200 | -1,374 |\n" +
                "| 2,400 | -0,916 |\n" +
                "| 2,600 | -0,602 |\n" +
                "| 2,800 | -0,356 |\n";
        Assert.assertEquals(expected, actual);
    }
}