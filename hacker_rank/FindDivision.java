public class FindDivision {

    static int findDigits (int num) {

        int dum = num;
        int count = 0;
        while (dum > 0) {
            int digit = dum % 10;
            if (digit != 0)
                count += (num % digit == 0) ? 1 : 0;
            dum /= 10;
        }

        return count;

    }
    public static void main (String ... varChar) {
        System.out.println(findDigits(123456789));
    }
}
