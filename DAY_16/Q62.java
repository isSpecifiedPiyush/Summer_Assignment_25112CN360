package DAY_16;

import java.util.*;

public class Q62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array :: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter the number at idx " + i +" :: ");
            arr[i] = sc.nextInt();
        }

        int max_freq = 0, ele_idx = -1;
        
        for(int i = 0 ; i< arr.length; i++) {
            int freq = 1;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] == arr[i]) {
                    freq++;
                }
            }
            if(freq > max_freq) {
                max_freq = freq;
                ele_idx = i; 
            }
        }
        System.out.print("The maximum frequency element in arry is " + arr[ele_idx] +" having frequengy " + max_freq);
    }
}
