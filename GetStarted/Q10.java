package GetStarted;

import java.util.Scanner;

public class Q10 {
    public static void findGCDandLCM(int n, int m){
        //approach 1
        int a= n;
        int b=m;
        int gcd = 0;
        for(int i=n; i>=1; i--){
            if(m%i == 0){
                System.out.println("GCD of number is " + i);
                gcd = i;
                break;
                
            }
        }

        // //approach 2
        // int gcd = 0;
        // if(n>m){
        //     // int rem = 0;
        //     while(m !=0){
        //         int rem = n%m;
        //         n = m;
        //         m = rem;
        //         System.out.println("GCD of two number is " + n);
        //         gcd = n;
        //     }
        // }else{
        //     while(n!=0){
        //         int rem = m%n;
        //         m = n;
        //         n = rem;
        //         System.out.println("GCD of two number is "+  m);
        //         gcd = m;
        //     }
        // }

        System.out.println("lcm of two number is " + ((a*b)/gcd));
        


    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();
        int m = scan.nextInt();
        findGCDandLCM(n, m);
    }
}
