package DAY_23;

import java.util.Scanner;

public class Q90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String :: ");
        String str = sc.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (freq[ch] == 1) {
                System.out.println("The first repeating character is :: " + ch);
                return;
            }

            freq[ch]++;
        }

        System.out.println("No repeating character found.");
    }
}
