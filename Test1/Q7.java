package Test1;

import java.util.Scanner;

public class Q7{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number");
        int n1 = scan.nextInt();
        System.out.println("enter the second number");
        int n2 = scan.nextInt();
        if(n1<n2){
            for(int i=n1; i>=1; i--){
                if(n2%i == 0 && n1%i == 0){
                    System.out.println("GCD of two number is" +i);
                    return;
                }
            }
        }else{
            for(int i=n2; i>=1; i--){
                if(n2%i == 0 && n1%i == 0){
                    System.out.println("GCD of two number is" +i);
                    return;
                }
            }
        }

        scan.close();
    }
}