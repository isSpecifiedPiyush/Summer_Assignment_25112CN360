package DAY_21;

import java.util.*;

public class Q82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String which is to reversed :: ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);

        int i = 0, j = sb.length() - 1;

        while(i < j) {
            char temp_1 = sb.charAt(i);
            char temp_2 = sb.charAt(j);
            sb.setCharAt(j, temp_1);
            sb.setCharAt(i, temp_2);
            j--;
            i++;
        }

        System.out.print(sb);
    }
}
