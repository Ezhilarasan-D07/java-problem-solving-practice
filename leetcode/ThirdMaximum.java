
public class ThirdMaximum {
    
    static int thirdMax (int ... arr) {

        Integer max = null;
        Integer sec = null;
        Integer thd = null;

        for (int num : arr) {

            if (max != null && num == max ||
                sec != null && num == sec ||
                thd != null && num == thd) {
                continue;
            }

            if (max == null || num > max) {

                thd = sec;
                sec = max;
                max = num;

            } else if (sec == null || num > sec) {

                thd = sec;
                sec = num;

            } else if (thd == null || num > thd) {

                thd = num;
            }
        }

        return thd == null ? max : thd;
    }

    public static void main(String ... varChar) {
        System.out.println(thirdMax(5, 3, 7, 8));
    }
}