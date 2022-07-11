package GetStarted;

import java.util.Scanner;

public class Q7 {
    public static void reverseTheNumber(int n){
        while(n!=0){
            int rem=n%10;
            int ques=n/10;
            n=ques;
            System.out.print(rem);
        }
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");

        int n=scan.nextInt();
        reverseTheNumber(n);
        scan.close();
    }
}
