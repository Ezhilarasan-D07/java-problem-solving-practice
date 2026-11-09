
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class Intersection {

    public static int [] intersection (int a [], int b []) {

        Map <Integer, Integer> map = new HashMap <> ();

        for (int num: a) 
            map.put(num, map.getOrDefault(num, 0) + 1);

        List <Integer> array = new ArrayList <> ();

        for (int num: b)
            if(map.get(num) != null && map.get(num) > 0) {
                array.add(num);
                map.put(num, map.get(num) - 1);
            }
                
        int result [] = new int [array.size()];

        int i = 0;
        for (int num: array)
            result[i++] = num;

        return result;

    }
    
    public static void main (String ... varChar) {

        int a [] = {1, 2, 2, 1};
        int b [] = {2, 2};

        System.out.println(Arrays.toString(intersection(a, b)));

    }
}