package DAY_12;

import java.util.*;

public class Q48 {

    public static int PerfectNum(int x) {
        int num = 0;
        
        for(int i = 1; i < x; i++) {
            if(x % i == 0) {
                num += i;
            }
        }
        
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to be cheaked :: ");
        int num = sc.nextInt();

        if(PerfectNum(num) == num) {
            System.out.print("The number is Perfect number");
        } else {
            System.out.print("Not a perfect number");
        }
    }
}
