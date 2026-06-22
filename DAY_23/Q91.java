package DAY_23;

import java.util.*;

public class Q91 {
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
            System.out.print("Not a anagram");
            return;
        }

        for(int i = 0; i < c1.length; i++) {
            if(c1[i] != c2[i]) {
                System.out.print("Not a anagram");
                return;
            }
        }

        System.out.print("The enterde Strings is anagram");
    }
}
