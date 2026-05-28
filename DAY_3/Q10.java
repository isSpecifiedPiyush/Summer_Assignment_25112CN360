package DAY_3;

import java.util.*;

public class Q10 {

    public static boolean isPrime(int x) {
        for(int i = 2; i * i <= x ; i ++) {
            if(x % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Range of Number to be cheaked wheater Prime or not :: ");
        int num = sc.nextInt();

        for(int i = 2; i <= num;i ++) {
            if(isPrime(i) == true) {
                System.out.print(i + " ");
            }
        }
    }
}
