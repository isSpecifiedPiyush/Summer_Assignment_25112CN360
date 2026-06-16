package DAY_17;

import java.util.*;

public class Q66 {
    public static void main(String args[]) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            set.add(num);
        }

        System.out.print("Union of Arrays: ");
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}
