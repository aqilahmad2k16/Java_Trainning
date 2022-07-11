package Recursion;

import java.util.Scanner;

public class Q1 {
    public static void printIncreasing(int n){
        if(n==0){
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the value ");
        int n=scan.nextInt();
        printIncreasing(n);
        scan.close();
    }
}
