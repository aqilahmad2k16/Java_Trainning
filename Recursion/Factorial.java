package Recursion;

import java.util.Scanner;

public class Factorial {

    // public static int findFactorial(int n){
    //     if(n==0){
    //         return 1;
    //     }

    //     int val = findFactorial(n-1);

    //     return n*val;
    // }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter value of n");

        int n=scan.nextInt();

        //approach 1
        // int val=1;
        // for(int i=1; i<=n; i++){
        //     val= val*i;
        // }

        // System.out.println("factorial of number is " + val);

        //2nd approach recursion

        System.out.println(findFactorial(n));


    }

    public static int findFactorial(int n){ // expetation
        if(n == 0){
            return 1;
        }
        int val = findFactorial(n-1); /// faith
        return n*val;

    }
}
