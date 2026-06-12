package DAY_14;

import java.util.*;

public class Q55 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array :: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter the number at idx " + i +" :: ");
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE , sec_max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                sec_max = max;
                max = arr[i];
            } else if(arr[i] > sec_max && arr[i] != max) {
                sec_max = arr[i];
            }
        }

        System.out.print("The second maximum number in array is :: " + sec_max);
        
    }
}
