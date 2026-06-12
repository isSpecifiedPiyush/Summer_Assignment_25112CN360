package DAY_13;

import java.util.*;

public class Q50 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array :: ");
        int size = sc.nextInt();   
        
        int[] arr = new int[size];
        int sum = 0;
        double avg = 0;

        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter the number at idx " + i +" :: ");
            arr[i] = sc.nextInt();
            sum += arr[i]; 
        }

        avg = sum / arr.length;
        
        System.out.print("The sum of elements and average of array is :: " + (sum) + " and " + (avg));
    }
}
