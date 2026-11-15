
public class SubString {
    
    static int countSubStringInString (String str, String sub) {
        int count = 0;

        for (int i = 0; i <= str.length() - sub.length(); i++) {
            if (str.substring(i, i + sub.length()).equals(sub))
                count++;
        }

        return count;
    }
    public static void main (String ... varChar) {
        System.out.println("the count of sub string in a string is : " + countSubStringInString("abadabad", "bad"));
    }
}
