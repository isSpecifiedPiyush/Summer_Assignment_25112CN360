package DAY_13;

import java.util.*;

public class Q51 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of number :: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter the number at idx " + i +" :: ");
            arr[i] = sc.nextInt();
        }

        int larg = Integer.MIN_VALUE , min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > larg) {
                larg = arr[i];
            } 
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.print("The maximum and minimum elements of array is :: " + larg + " and " + min);
        
    }
}
