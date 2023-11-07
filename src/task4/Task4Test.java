package task4;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class Task4Test {

    @Test
    void searchPrimary() {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,10,11,12,13,14,15,16,17,18};
        List<Integer> actual = new ArrayList<Integer>();
        actual.add(1);
        actual.add(2);
        actual.add(4);
        actual.add(6);
        actual.add(9);
        actual.add(11);
        actual.add(15);
        List<Integer> expected = Task4.searchPrimary(arr);
        Assert.assertEquals(expected,actual);
    }
}