package DAY_25;

import java.util.*;

public class Q99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("The the number of names :: ");
        int no_name = sc.nextInt();

        String names[] = new String[no_name];

        for(int i = 0; i < names.length; i++) {
            System.out.print("Enter the name " + i +" :: ");
            names[i] = sc.next();
        }

        Arrays.sort(names);

        for(String ans : names) {
            System.out.println(ans);
        }
    }
}
