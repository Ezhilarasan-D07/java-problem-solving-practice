

import java.util.Scanner;

public class JavaIO2 {
    public static void main (String ... varChar) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        float decimal = input.nextFloat();
        input.nextLine();
        String string = input.nextLine();
        
        input.close();

        System.err.println("String: " + string);
        System.err.println("Double: " + decimal);
        System.err.println("Integer: " + number);

    }
}
