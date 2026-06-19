package DAY_21;

import java.util.*;

public class Q81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String :: ");
        String str = sc.nextLine();

        int count = 0;

        for(char ele : str.toCharArray()) {
            count++;
        }

        System.out.print("The length of string is :: " + count);
    }
}
