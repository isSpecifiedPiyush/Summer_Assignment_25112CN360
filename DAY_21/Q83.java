package DAY_21;

import java.util.*;

public class Q83 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String :: ");
        String str = sc.nextLine();

        int conso = 0, vowel = 0;

        str = str.toUpperCase();
        
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') vowel++;
            else conso++; 
        }

        System.out.print("Vowel in Entered String is :: " + vowel + " and Consonent is :: " + conso);
    }
}
