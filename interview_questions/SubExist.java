
public class SubExist {

    static boolean isSubStringExist (String str, String sub) {

        for (int i = 0; i <= str.length() - sub.length(); i++) {
            if (str.substring(i, i + sub.length()).equals(sub))
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println("is the sub string is presented in string : " + isSubStringExist("abadabad", " bad"));
    }
}
