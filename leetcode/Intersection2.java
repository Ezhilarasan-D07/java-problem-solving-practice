
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class Intersection2 {
    public static int [] intersection (int a [], int b []) {
                
        Set <Integer> set = new HashSet <> ();
        Set <Integer> intersect = new HashSet <> ();

        for (int num: a)
            set.add(num);

        for (int num: b)
            if (set.contains(num))
                intersect.add(num);

        int result [] = new int [intersect.size()];

        int i = 0;
        for (int num: intersect)
            result[i++] = num;

        return result;

    }
    
    public static void main (String ... varChar) {

        int a [] = {1, 2, 2, 1};
        int b [] = {2, 2};

        System.out.println(Arrays.toString(intersection(a, b)));
        
    }    
}
