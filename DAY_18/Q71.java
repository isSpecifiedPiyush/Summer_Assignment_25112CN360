package DAY_18;

import java.util.*;

public class Q71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array :: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter a sorted array");

        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter the number at idx " + i +" :: ");
            arr[i] = sc.nextInt();
        }

        int lo = 0, hi = arr.length - 1;

        System.out.print("Enter target element :: ");
        int tar = sc.nextInt();

        while(lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if(arr[mid] == tar) {
                System.out.print("Target found at idx :: " + mid);
                return;
            } else if(arr[mid] > tar) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
    }
}
