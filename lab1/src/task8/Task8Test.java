package task8;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Task8Test {

    @Test
    void solve() {
        int[] arr1 = new int[]{1,5,8,10,15,47,79};
        int[] arr2 = new int[]{1,15,28,100};
        int[] expected = Task8.solve(arr1, arr2);
        int[] actual = new int[]{1,5,6,7};
        Assert.assertArrayEquals(expected,actual);

    }
}