package GetStarted;

import java.util.Scanner;

public class Q4 {
    // Fabunacci Series
    public static void printAllFabunacciNumber(int n){
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=2; i<=n; i++){
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the fabunacci number");
        int n=scan.nextInt();
        printAllFabunacciNumber(n);
        scan.close();
    }
}
