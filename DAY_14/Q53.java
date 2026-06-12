package DAY_14;

import java.util.*;

public class Q53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array :: ");
        int size = sc.nextInt();

        System.out.print("Enter the target element :: ");
        int tar = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter the number at idx " + i +" :: ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == tar) {
                System.out.print("The target found at index :: " + i);
            }
        }
    }
}
