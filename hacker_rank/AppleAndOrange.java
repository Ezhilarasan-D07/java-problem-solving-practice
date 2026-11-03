
// s = starting-point-house = 7
// e = ending-point-house = 11

// a = apple tree = 5
// b = orange tree = 15

// apples : integer array -2 2 1 
// oranges : integer array 5 -6

import java.util.*;

public class AppleAndOrange {
    
    public static List <Integer> countApplesAndOranges (
        
            int homeStart, 
            int homeEnd, 
            int appleTree, 
            int orangeTree, 
            List <Integer> apples, 
            List <Integer> oranges
            
        ) 
        
        {
        
        int a = 0, b = 0;
        
        for (int fruit: apples) 
            if (fruit + appleTree >= homeStart) 
                a++;
    
        for (int fruit: oranges) 
            if (fruit + orangeTree >= homeEnd) 
                b++; 
                
        return Arrays.asList(a, b);

    }
    
    public static void main (String ... varChar) {
        
        int s = 7, e = 11, a = 5, b = 15;
        List <Integer> arrOne = Arrays.asList(-2, 2, 1);
        List <Integer> arrTwo = Arrays.asList(5, -6);
        
        System.out.println(countApplesAndOranges(s, e, a, b, arrOne, arrTwo));
    }
}