package task7;

public class Task7 {

    static public int[] sortArray(int[] arr){
        for (int i = 0; i < arr.length - 1;){
            if (arr[i] > arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                if (i != 0)
                    i--;
            }else
            {
                if (i != arr.length-1)
                    i++;
            }
        }
        return arr;
    }
}
