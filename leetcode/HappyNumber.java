
public class HappyNumber {

    static boolean isHappy (int num) {

        while (num != 1 && num != 4) {

            int sum = 0;

            while (num > 0) {
                int rem = num % 10;
                sum += rem * rem;
                num /= 10;
            }

            num = sum;

        }

        return num == 1;
    }
    public static void main(String[] args) {
        System.out.println((isHappy(19)) ? 
        "the given number is happy number" : 
        "the given number is not an happy number");

        System.out.println((isHappy(25)) ? 
        "the given number is happy number" : 
        "the given number is not an happy number");
    }
}