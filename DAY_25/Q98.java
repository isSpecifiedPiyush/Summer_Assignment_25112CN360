package DAY_25;
import java.util.*;
public class Q98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string:: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string:: ");
        String str2 = sc.nextLine();

        int[] freq = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'a'] = 1;
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < str2.length(); i++) {
            int idx = str2.charAt(i) - 'a';

            if (freq[idx] == 1) {
                ans.append(str2.charAt(i));
                freq[idx] = 0;
            }
        }

        System.out.println("Common Characters: " + ans);
    }
}
