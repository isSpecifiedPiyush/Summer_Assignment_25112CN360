package DAY_17;

import java.util.*;

public class Q68 {
    public static void main(String[] args) {
        
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;

        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            } else if(arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
    }
}
