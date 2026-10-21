
import java.util.*;

public class JavaIfElse {

    private static final Scanner input = new Scanner(System.in);
    public static void main (String ... args) {

        System.out.print("Enter your number :\t");
        int num = input.nextInt();
        input.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (num % 2 != 0)
            System.out.println("Weird");
        else if (num % 2 == 0 && (num >= 6 && num <= 20))
            System.out.println("Weird");
        else if (num % 2 == 0 && (num >= 2 && num <= 5))
            System.out.println("Not Weird");
        else if (num % 2 == 0 && num <= 20)
            System.out.println("Not Weird");

    }
}