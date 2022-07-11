package Recursion;

import java.util.Scanner;

public class Q3 {
    //expectation
    public static void printDecreasingIncreasing(int n){
        if(n==0){
            return;
        }

        System.out.print(n+" 5");/// pre-order
        //faith
        printDecreasingIncreasing(n-1);

        System.out.print(n+" ");//post-order

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=scan.nextInt();
        printDecreasingIncreasing(n);
        scan.close();
    }
}
