
public class LargestInArray {

    static int largestElementInAnArray(int arr []) {

        if (arr.length == 1) 
            return arr[0];

        int largestNumber = arr[0];

        for (int i = 1; i < arr.length; i++) 
            if (arr[i] > largestNumber) 
                largestNumber = arr[i];

        return largestNumber;

    }
    public static void main (String ... args) {

        int arrayOne [] = {1, 8, 7, 56, 90};
        int arrayTwo [] = {5, 5, 5, 5};
        int arrayTre [] = {10};

        System.out.println("the largest element of arr one is : " + largestElementInAnArray(arrayOne));
        System.out.println("the largest element of arr two is : " + largestElementInAnArray(arrayTwo));
        System.out.println("the largest element of arr three is : " + largestElementInAnArray(arrayTre));

    }
}
