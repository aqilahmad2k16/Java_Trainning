package Recursion;

import java.util.Scanner;

public class Q2 {
    public static void printDecreasing(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        printDecreasing(n-1);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the value");
        int n=scan.nextInt();
        printDecreasing(n);
        scan.close();
    }
}
