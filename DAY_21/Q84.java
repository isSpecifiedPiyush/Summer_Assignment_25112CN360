package DAY_21;

import java.util.*;

public class Q84 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String :: ");
        String str = sc.nextLine();

        String result = "";

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }

            result += ch;
        }

        System.out.print("The Upper case of String is :: " + result);
    }
}
