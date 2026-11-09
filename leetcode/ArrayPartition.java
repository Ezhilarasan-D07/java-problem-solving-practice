
import java.util.Arrays;

public class ArrayPartition {

    static int findArrayPartition(int ... arr) {

        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i += 2)
            sum += arr[i];

        return sum;

    }
    public static void main (String ... varChar) {
        System.out.println(findArrayPartition(3, 2, 4, 1));
    }
}