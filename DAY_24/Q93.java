package DAY_24;

import java.util.*;

public class Q93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string :: ");
        String s1 = sc.nextLine();

        System.out.print("Enter the Second string :: ");
        String s2 = sc.nextLine();
        
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if(c1.length != c2.length) {
            System.out.print("Not a rotated string");
            return;
        }

        for(int i = 0; i < c1.length; i++) {
            if(c1[i] != c2[i]) {
                System.out.print("Not a rotated string");
                return;
            }
        }

        System.out.print("The entered Strings is rotated to each other");
    }
}
