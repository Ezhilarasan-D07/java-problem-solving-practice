
import java.util.Map;
import java.util.LinkedHashMap;

public class FirstUniqueCharacter {

    static int findFirstUniqueCharacter (String str) {

        Map <Character, Integer> map = new LinkedHashMap <> ();
        for (char chr: str.toCharArray()) 
            map.put(chr, map.getOrDefault(chr, 0) + 1);

        for (Map.Entry <Character, Integer> e: map.entrySet()) 
            if (e.getValue() == 1)
                return str.indexOf(e.getKey());

        return -1;

    }

    public static void main (String ... varChar) {
        System.out.println("the first unique char is : " + findFirstUniqueCharacter("ayyappan"));
    }
}