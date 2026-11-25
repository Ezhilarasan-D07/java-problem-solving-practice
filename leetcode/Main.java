
import java.util.*;
public class Main {
    
    static int [] orderRecover (int [] order, int [] friends) {
        
        Map <Integer, Integer> map = new HashMap <> ();
        int place = 0;
        
        for (int k: order) 
            for (int friend: friends) 
                if (k == friend) {
                    map.put(k, place);
                    place++;
                }

        int [] result = new int[friends.length];  
        
        for (Map.Entry <Integer, Integer> m: map.entrySet()) 
            result[m.getValue()] = m.getKey();
        
        return result;
        
    }
    
    public static void main (String ... varChar) {
        
        int order [] = {3, 1, 2, 5, 4};
        int friends [] = {1, 3, 4};
        System.out.print(Arrays.toString(orderRecover(order, friends)));
        
    }
    
}