package DAY_22;

import java.util.Scanner;

public class Q88 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string :: ");
        String str = sc.nextLine();
        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                ans += str.charAt(i);
            }
        }

        System.out.println(ans);

    }
}
