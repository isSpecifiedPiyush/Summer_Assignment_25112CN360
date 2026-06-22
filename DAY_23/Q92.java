package DAY_23;

import java.util.Scanner;

public class Q92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String :: ");
        String str = sc.nextLine();

        int[] freq = new int[256];
        
        for(int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i);
            freq[ch]++;
        }

        int max = Integer.MIN_VALUE, max_idx = -1;

        for(int i = 0; i < freq.length; i++) {
            if(max < freq[i]) {
                max = freq[i];
                max_idx = i;
            }
        }

        System.out.print("The maximum frequency character in String is :: " + (char)(max_idx));
    }
}
