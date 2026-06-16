package DAY_17;

import java.util.*;

public class Q65 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};

        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] merged = new int[n1 + n2];

        for (int i = 0; i < n1; i++) {
            merged[i] = arr1[i];
        }

        for (int i = 0; i < n2; i++) {
            merged[n1 + i] = arr2[i];
        }

        System.out.print("Merged Array is :: ");
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}
