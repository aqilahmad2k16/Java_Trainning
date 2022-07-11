package GetStarted;

import java.util.Scanner;

public class Q5 {
    //find the digit of the number
    public static void findTheDigitOfNumber(int n){
        int don=0;
        while(n!=0){
            n /= 10;
            don++;
        }

        System.out.println("the number of digit in the number is "+ don);
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        int n=scan.nextInt();
        findTheDigitOfNumber(n);
        scan.close();
    }
}
