import java.util.*;
public class MoveZeros {

    static void moveZerosToEnd (int ... arr) {

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                if (i != j)
                    arr[i] = arr[j] + arr[i] - (arr[j] = arr[i]);
                j++;
            }
        }

    }

    public static void main (String ... varChar) {
        int[] arr = {1, 0, 5, 3, 0, 9, 0, 8, 5};

        moveZerosToEnd(arr);

        System.out.println("Array after moving zeroes to end: "
                + Arrays.toString(arr));
            }
}