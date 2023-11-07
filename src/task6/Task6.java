package task6;

public class Task6 {

    static public int[][] generateMatrix(int[] arr){
        int arrSize = arr.length;
        int offset = 0;
        int[][] matrix = new int[arrSize][arrSize];
        for (int i = 0; i < arrSize; i++)
        {
            for (int j = 0; j < arrSize; j++)
            {
                matrix[i][j] = arr[(j+offset)%arrSize];
            }
            offset++;
        }
        return matrix;
    }
}
