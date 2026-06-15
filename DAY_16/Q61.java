package DAY_16;

import java.util.*;

public class Q61 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array :: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter a sorted array");

        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter the number at idx " + i +" :: ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        
        System.out.print("The missing element in array is :: " + ((arr.length)*(arr.length + 1) / (2) - (sum)));
    }
}
