package task5;

public class Task5 {

    public static int howManyDelete(int[] arr) {
        int length = arr.length;
        int[] testArr = new int[length];
        testArr[0] = arr[0];
        for(int i=1; i<length; i++)
            testArr[i] = Integer.MAX_VALUE;
        int lastInd = 0;

        for(int i=1; i<length; i++) {
            if(arr[i] > testArr[lastInd]) {
                lastInd++;
                testArr[lastInd] = arr[i];
            }
            else {
                int ind = binarySearch(testArr, arr[i]);
                testArr[ind] = arr[i];
            }
        }
        int subsequenceLength = lastInd + 1;

        return length - subsequenceLength;
    }

    private static int binarySearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        int middle = 0;

        while (left <= right) {
            middle = (left + right) / 2;
            if (arr[middle] >= x)
                right = middle - 1;
            else
                left = middle + 1;
        }
        return left;
    }
}
