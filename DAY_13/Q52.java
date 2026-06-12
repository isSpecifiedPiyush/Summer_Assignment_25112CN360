package DAY_13;

import java.util.*;

public class Q52 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of number :: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int odd_num = 0, even_num = 0; 

        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter the number at idx " + i +" :: ");
            arr[i] = sc.nextInt();

            if(arr[i] % 2 == 0) {
                even_num++;
            } else {
                odd_num++;
            }
        }
        System.out.print("The odd and even elements of array is :: " + odd_num + " and " + even_num);
    }
}
