import java.util.Arrays;

public class RotateArrayByOne {

    static int [] rotate(int arr []) {

        int last = arr[0];
        for (int i = 1; i < arr.length; i++)
            arr[i - 1] = arr[i];

        arr[arr.length - 1] = last;

        return arr;

    } 

    public static void main (String ... varChar) {
        int arr [] = {3, 5, 4, 2, 1};
        System.out.println("The array rotated by one index : " + Arrays.toString(rotate(arr)));
    }
}
