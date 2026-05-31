package DAY_5;

import java.util.*;

public class Q17 {

    public static boolean IsPrefect(int x) {
        if(x <= 1) {
            return false;
        }
        int sum = 1;

        for(int i = 2; i * i <= x; i++) {
            if(x % i == 0) {
                sum += i; 

                if(i != x / i) {
                sum += x / i;
                }
            }
        }
        return sum == x;
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to be cheaked wheather Perfect or not :: ");
        int num = sc.nextInt();

        if(IsPrefect(num)) {
            System.out.print("The number " + num + " is a Perfect number");
        } else {
            System.out.print("Not a Perfect number");
        }
    }
}
