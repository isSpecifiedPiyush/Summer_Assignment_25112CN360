package DAY_14;

import java.util.*;

public class Q54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array :: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter the number at idx " + i +" :: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the Frequency element :: ");
        int tar = sc.nextInt();

        int freq = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == tar) {
                freq++;
            }
        }

        System.out.print("The frequency of element " + tar + " is :: " + freq);
    }
}
