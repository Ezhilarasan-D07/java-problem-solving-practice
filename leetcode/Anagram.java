import java.util.Map;
import java.util.HashMap;

public class Anagram {

    static boolean isAnagram(String a, String b) {

        Map <Character, Integer> map = new HashMap <> ();

        for (int i = 0; i < a.length(); i++) {

            char chr = a.charAt(i);
            if (!map.containsKey(chr))
                return false;

            map.put(chr, map.get(chr) - 1);

            if (map.get(chr) == 0)
                map.remove(chr);
        }

        return map.isEmpty();
            

    }
    public static void main (String ... varChar) {
        System.out.println((isAnagram("ezhil", "neha")) ? "it is anagram" : "not an anagram");
    }
}
