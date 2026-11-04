import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentOfTwo {
    public static int moreFrequent(List <Integer> arr, int x, int y) {

        int X = 0, Y = 0;
        Map <Integer, Integer> map = new HashMap <> ();

        for (int num: arr)
            map.put(num, map.getOrDefault(num, 0) + 1);
        
        for (Map.Entry<Integer, Integer> e: map.entrySet()) {

            if (X == e.getKey()) 
                X = e.getValue();

            if (Y == e.getKey()) 
                Y = e.getValue();

        }

        if (X != Y) 
            return (X > Y) ? x : y;
        
        return (x < y) ? x : y;
    }
}
