package DAY_1;
import java.io.*;
import java.util.*;
import java.util.Scanner;


class sum_of_N_natural_numbers_by_loop {
    public static void main(String[] args)
    {
        int N = 0;
        System.out.println("This program will find sum on first N natural numbers");
        System.out.print("Please specify the value of N : ");
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        int sum = 0;
        System.out.println("Finding Sum of " + N + " numbers...");

        for (int i = 1; i <= N; i++) {
            sum += i;
        }
      
        System.out.println("Sum of first " + N + " Natural Number = " + sum);
    }
}