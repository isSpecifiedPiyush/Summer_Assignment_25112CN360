package DAY_12;

import java.util.*;

public class Q45 {

    public static boolean Palindrome(String x) {
        String y = "";
        for(int i = x.length() - 1; i >= 0; i--) {
            y += x.charAt(i);
        }
        if(x.compareTo(y) != 0) {
            return false;
        } 

        return true;
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to be cheaked wheather palindrome :: ");
        String s = sc.nextLine();

        if(Palindrome(s) == true) {
            System.out.print("The number entered is Palindrome");
        } else {
            System.out.print("Not a Palindrome");
        }

    }
}
