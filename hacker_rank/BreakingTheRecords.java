

import java.util.Arrays;
public class BreakingTheRecords {
    
    static int [] breakingRecords (int ... arr) {
        
        int [] answer = {0, 0};
        int min = arr[0];
        int max = arr[0];
        int minCount = 0;
        int maxCount = 0;
        
        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] < min) {
                minCount++;
                min = arr[i];
            }
            
            if (arr[i] > max) {
                maxCount++;
                max = arr[i];                
            }
        }
        
        answer[1] = minCount;
        answer[0] = maxCount;
        
        return answer;
        
    }
    
    public static void main (String ... varChar) {
        System.out.println("the minimum and maximum of records are : "
        + Arrays.toString(breakingRecords(10, 5, 20, 20, 4, 5, 2, 25, 1)));
    }
}