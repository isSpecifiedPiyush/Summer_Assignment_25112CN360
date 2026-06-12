package DAY_15;

import java.util.*;

public class Q59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array :: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter the number at idx " + i +" :: ");
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the intger to rotate arrya in Clockwise :: ");
        int d = sc.nextInt();

        int n = (arr.length - d) % 10;

        if(n == 0) {
            System.out.println("No rotation in this array");
            for(int ele : arr) {
                System.out.print(ele + " ");
            }
        } else {
            int i = 0, j = n - 1;

            while(i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--; 
            }

            i = n;
            j = arr.length - 1;

            while(i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--; 
            }

            i = 0;
            j = arr.length - 1;

            while(i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--; 
            }
        }

        for(int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
