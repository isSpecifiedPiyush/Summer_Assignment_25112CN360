package DAY_1;

import java.util.*;

class Q1 {
    public static void main(String[] args)
    {
        int N = 0;
        System.out.println("This program will find sum on first N natural numbers");
        System.out.print("Please specify the value of N : ");
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        int sum = 0;
        System.out.println("Finding Sum of " + N + " numbers...");

        sum = N*(N+1);
        sum = sum/2;
      
        System.out.println("Sum of first " + N + " Natural Number = " + sum);
    }
}