package DAY_16;

import java.util.*;

public class Q63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array :: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter the number at idx " + i +" :: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the sum of two numbers :: ");
        int tar = sc.nextInt();

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == tar) {
                    System.out.print("The given target founded at index :: " + i + " and " + j);
                    return;
                }
            }
        }
        System.out.print("Target is not present in the given array");

    }
}
