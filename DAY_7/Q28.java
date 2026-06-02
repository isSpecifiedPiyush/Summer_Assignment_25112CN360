package DAY_7;

import java.util.*;

public class Q28 {

    static int rev = 0;

    public static int ReverseNum(int num) {
        if(num == 0) {
            return rev;
        }
        rev = rev * 10 + (num % 10);
        
        return ReverseNum(num / 10);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to be Reversed :: ");
        int num = sc.nextInt();

        System.out.print("The reverse of number " + num +" is :: " + ReverseNum(num));
    }
}
