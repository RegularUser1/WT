package task7;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Task7Test {

    @Test
    void sortArray() {
        int[] arr = new int[]{5,4,1,2,3,8,3,21,5,7,9,0,5};
        int[] expected = Task7.sortArray(arr);
        int[] actual = new int[]{0,1,2,3,3,4,5,5,5,7,8,9,21};
        Assert.assertArrayEquals(expected,actual);
    }
}