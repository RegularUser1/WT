package task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {

    static public boolean checkPrimary(int value){
        if (value <= 1)
            return false;
        if (value == 2 || value == 3)
            return true;
        for (int j = 2; j <= Math.sqrt(value); j++){
            if (value % j == 0) {
                return false;
            }
        }
        return true;
    }
    static public List<Integer> searchPrimary(int[] arr){
        List<Integer> numberOfPrimary = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++){
            if (checkPrimary(arr[i])){
                numberOfPrimary.add(i);
            }

        }
        return numberOfPrimary;
    }
}
