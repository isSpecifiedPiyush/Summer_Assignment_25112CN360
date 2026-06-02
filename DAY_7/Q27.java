package DAY_7;

import java.util.*;

public class Q27 {

    public static int SumDigit(int num) {
        if(num == 0) {
            return 0;
        }

        SumDigit(num / 10); 

        return (num % 10) + SumDigit(num / 10);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of digits is to be Finded :: ");
        int num = sc.nextInt();

        System.out.print(SumDigit(num));
    }
}
