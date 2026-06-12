package DAY_15;

import java.util.*;

public class Q60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array :: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter the number at idx " + i +" :: ");
            arr[i] = sc.nextInt();
        }

        int j = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                if(i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j ++;
            }
        }

        for(int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
