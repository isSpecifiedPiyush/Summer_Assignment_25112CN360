package DAY_23;

import java.util.Scanner;

public class Q89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String :: ");
        String str = sc.nextLine();

        int i = 0, j = 1;

        while(j < str.length()) {
            if(str.charAt(i) != str.charAt(j)) j++;
            else {
                System.out.print("The first repeating character is :: " + str.charAt(j));
                return;
            }
        }
    }
}
