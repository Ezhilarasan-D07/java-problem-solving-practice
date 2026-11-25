
import java.util.Arrays;
public class LeftRightDiff {

    static  int [] leftRightDifference(int ... arr) {

        int rightSum = 0, leftSum = 0;
        int ans [] = new int [arr.length];

        for (int num: arr)
            rightSum += num;

        for (int i = 0; i < arr.length; i++) {
            rightSum -= arr[i];
            ans[i] = Math.abs(leftSum - rightSum);
            leftSum += arr[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(leftRightDifference(9, 8, 5, 3)));
    }

}
