package DAY_18;

import java.util.*;

public class Q72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array :: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter the number at idx " + i +" :: ");
            arr[i] = sc.nextInt();
        } 

        for(int i = 0; i < arr.length - 1; i++) {
            for(int j =  0; j < arr.length - i - 1; j++) {
                if(arr[j] < arr[j + 1]) {
                     int temp = arr[j];
                     arr[j] = arr[j + 1];
                     arr[j + 1] = temp;
                } 
            }
        }
        System.out.print("The sorted array is :: ");
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
