package DAY_22;

import java.util.*;

public class Q87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the String :: ");
        String str = sc.nextLine();

        int freq[] = new int[26];

        int i = 0;

        str = str.trim();

        while(i < str.length()) {
            int idx = 0;
            if(str.charAt(i) == ' ') i++;
            else {
                idx = str.charAt(i) - 'a';
                freq[idx] += 1;
                i++;
            }
        }
        
        for(int j = 0; j < freq.length; j++) {
            System.out.println("the frequency of " + ((char)(97+j)) + " is :: " + freq[j]);
        }
    }
}
