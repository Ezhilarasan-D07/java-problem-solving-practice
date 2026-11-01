
import java.util.*;
public class MinMaxSum {

    static List <Integer> findMixMax(List <Integer> array) {

        int sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int num: array)    {

            sum += num;
            min = Math.min(num, min);
            max = Math.max(num, max);

        }

        return Arrays.asList(sum - max, sum - min);

    }

    public static void main (String ... varChar) {
        System.out.println("the minimum and the maximum sum of an array is : " + 
        findMixMax(Arrays.asList(7, 22, -16, 26, 5)));
    }
}
