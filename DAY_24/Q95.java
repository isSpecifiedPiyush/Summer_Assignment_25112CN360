package DAY_24;
import java.util.*;
public class Q95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string :: ");
        String str = sc.nextLine();

        String words[] = str.split(" ");

        String longest = "";

        for(String word : words) {
            if(word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.print("Longest word is :: " + longest);

    }
}
