package DAY_22;

import java.util.*;

public class Q85 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String :: ");
        String str = sc.nextLine();

        int i = 0, j = str.length() - 1;

        str = str.toUpperCase();

        while(i <= j) {
            if(str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                System.out.print("Not a palindrome");
                return;
            }
        }

        System.out.print("The entered string is palindrome");
    }
}
