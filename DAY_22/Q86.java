package DAY_22;

import java.util.*;

public class Q86 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String :: ");
        String str = sc.nextLine();

        str = str.trim();

        if (str.isEmpty()) {
            System.out.println("Number of words = 0");
        } else {
            String[] words = str.split("\\s+");
            System.out.println("Number of words = " + words.length);
        }
    }
}
