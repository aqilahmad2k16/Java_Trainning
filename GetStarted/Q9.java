package GetStarted;

import java.util.Scanner;

public class Q9 {
    public static int findTheInverse(int n){
        // int fv=1;
        int pv = 1;
        int sm=0;
        while(n!=0){
            int fv = n%10;
            n /= 10;
            int npv = pv;
            int pow = (int)Math.pow(10, fv-1);
            sm += npv*pow;
            pv++;
        }

        return sm;
    }
    //find inverse of the number
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();
        if(n<0){
            System.out.println("Number is not valid please give a valid number");
            return;
        }
        System.out.println(findTheInverse(n));

        scan.close();
    }
}
