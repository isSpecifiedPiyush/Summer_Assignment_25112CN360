package DAY_25;
import java.util.*;
public class Q97 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int n = arr1.length;
        int m = arr2.length;

        int[] ans = new int[n + m];

        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                ans[k++] = arr1[i++];
            } else {
                ans[k++] = arr2[j++];
            }
        }

        while (i < n) {
            ans[k++] = arr1[i++];
        }

        while (j < m) {
            ans[k++] = arr2[j++];
        }

        System.out.print("Merged Array: ");
        for (int ele : ans) {
            System.out.print(ele + " ");
        }
    }
}
