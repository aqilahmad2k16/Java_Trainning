package Test3;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the range ");
        int l=scan.nextInt();
        int r=scan.nextInt();

        // System.out.println(((r-l+1)*(l+r))/2);

        int sum = 0;
        for(int i=l; i<=r; i++){
            sum += i;
        }

        System.out.println(sum);
        scan.close();
    }
}
