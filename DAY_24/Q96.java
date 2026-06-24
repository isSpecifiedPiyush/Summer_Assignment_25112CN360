package DAY_24;
import java.util.*;
public class Q96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ans.indexOf(String.valueOf(ch)) == -1) {
                ans.append(ch);
            }
        }

        System.out.println("After removing duplicates: " + ans);
    }
}
