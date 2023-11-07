package task6;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Task6Test {

    @Test
    void generateMatrix() {
        int[] arr = new int[]{1,2,3,4};
        int[][] expected = Task6.generateMatrix(arr);
        int[][] actual = new int[][]{{1,2,3,4},
                                    {2,3,4,1},
                                    {3,4,1,2},
                                    {4,1,2,3}};
        Assert.assertEquals(expected,actual);
    }
}