package DAY_24;

import java.util.*;

public class Q94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Stiring :: ");
        String str = sc.nextLine();

        int freq[] = new int[26];

        for(int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 'a';
            freq[idx]++;
        }

        String ans = "";
        StringBuilder sb = new StringBuilder(ans);

        for(int i = 0; i < freq.length; i++) {
            if(freq[i] == 0) {
                continue;
            } else {
                sb.append((char)(97+i));
                sb.append(freq[i]);
            }
        }

        System.out.print(sb);
    }
}
