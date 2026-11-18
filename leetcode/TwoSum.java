
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class TwoSum {

    public static int[] findTwoSum(int arr [], int x) {
        
        for (int i = 0; i < arr.length; i++) 
            for (int j = 0; j < arr.length; j++) 
                if (i != j && arr[i] == x - arr[j])
                    return new int []{i, j};
        
        return new int []{-1, -1};

    }

    public static int[] findTwoSumHashMap (int arr [], int x) {
        Map <Integer, Integer> map = new HashMap <> ();

        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];
            if (map.containsKey(x - num))
                return new int [] {map.get(x - num), i};
            
            map.put(num, i);
        }

        return new int [] {};

    }

    public static void main(String ... varChar) {
        int arr [] = { 3, 4, 5, 2, 1, 6, 7, 8};
        int x = 6;
        System.out.println(Arrays.toString(findTwoSum(arr, x)));
    }
}