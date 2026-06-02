package DAY_7;

import java.util.*;

public class Q25 {

    public static int FactorialRec(int x) {
        if(x == 0 || x == 1) {
            return 1;
        }
        FactorialRec(x - 1);
        return x * FactorialRec(x - 1);
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of which factorial is to be finded :: ");
        int num = sc.nextInt();

        System.out.print("Factorial of number " + num + " is :: " + FactorialRec(num));
    }
}
