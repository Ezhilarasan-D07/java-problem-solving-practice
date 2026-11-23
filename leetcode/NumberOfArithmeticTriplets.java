
import java.util.HashMap;
public class NumberOfArithmeticTriplets {
    
    public static int countArithmeticTriplets (int diff, int arr []) {

        HashMap <Integer, Integer> seen = new HashMap <> ();
        int count = 0;

        for (int i = 0; i < arr.length; i++)
            seen.put(arr[i], i);
    
        for (int num: arr)
              if (seen.containsKey(num + diff) && seen.containsKey(num + 2 * diff))
                count++;
            
        return count;

    }


    public static void main(String[] args) {

        int arr [] = {0, 1, 4, 6, 7, 10};
        System.out.println(countArithmeticTriplets(3, arr));

    }

}
