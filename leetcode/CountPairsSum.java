
public class CountPairsSum {

    static  int countPairs(int [] arr, int x) {

        int count = 0;
        
        for (int i = 0; i < arr.length; i++) 
            for (int j = i + 1; j < arr.length; j++) 
                if (i < j && arr[i] + arr[j] < x)   
                    count++;

        return count;   
    }

    public static void main (String ... varChar) {
        int arr [] = {-6, 2, 5, -2, -7, -1, 3};
        System.out.print("count pairs " + countPairs(arr, -2));
    }
}
