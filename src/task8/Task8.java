package task8;

public class Task8 {

    public static int[] solve(int[] arr1, int[] arr2) {
        int[] res = new int[arr2.length];
        int j = 0;
        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] > arr2[j]) {
                res[j] = i;
                j++;
            }
        }
        for (int k = 0 ; j < arr2.length; j++, k++){
            res[j] = arr1.length + k;
        }

        return res;
    }


}
