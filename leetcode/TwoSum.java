
import java.util.Arrays;

public class TwoSum {

    public static int[] findTwoSum(int arr [], int x) {
        
        for (int i = 0; i < arr.length; i++) 
            for (int j = 0; j < arr.length; j++) 
                if (i != j && arr[i] == x - arr[j])
                    return new int []{i, j};
        
        return new int []{-1, -1};

    }
    public static void main(String ... varChar) {
        int arr [] = { 3, 4, 5, 2, 1, 6, 7, 8};
        int x = 6;
        System.out.println(Arrays.toString(findTwoSum(arr, x)));
    }
}