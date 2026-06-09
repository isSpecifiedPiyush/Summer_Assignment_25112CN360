package DAY_11;

import java.util.*;

public class Q41 {

    public static int SumOfTwo(int x , int y) {
        int sum = x + y;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First number :: ");
        int num_1 = sc.nextInt();

        System.out.print("Enter the Second number :: ");
        int num_2 = sc.nextInt();

        System.out.print("The sum of number is " + SumOfTwo(num_1, num_2));
    }
}
