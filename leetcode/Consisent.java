
import java.util.*;

class Consistent {

    static int countConsisent (String chars, String words []) {

        int count = 0;
        Set <Character> set = new HashSet <> ();
        for (char ch: chars.toCharArray())
            set.add(ch);

        for (String word: words) {

            boolean flag = true;
            for (char ch: word.toCharArray()) {
                if (!set.contains(ch)) {
                    flag = false;
                    break;
                }
            }

            if (flag) count++;

        }

        return count;

    }
    
    public static void main(String[] args) {

        String words [] = {"aab", "add", "aaa", "arv", "baa"};
        System.out.println(countConsisent( "ab", words));
    }
}