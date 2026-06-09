package DAY_11;

import java.util.*;

public class Q42 {

    public static int MaxNumber(int x , int y) {
        if(x > y) {
            return x;
        } else {
            return y;
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First number :: ");
        int num_1 = sc.nextInt();

        System.out.print("Enter the Second number :: ");
        int num_2 = sc.nextInt();

        System.out.print("The maximum number of numbers " + num_1 + " and " + num_2 + " is :: " + MaxNumber(num_1, num_2));
    }
}
