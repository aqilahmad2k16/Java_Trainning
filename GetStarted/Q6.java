package GetStarted;

import java.util.Scanner;

public class Q6 {
    public static void displayTheNumber(int n){
        int don=0;
        int m=n;
        while(n!=0){
            n /=10;
            don++;
        }
        int pow=(int)Math.pow(10, don-1);
        while(m!=0 || pow !=0){
            int ques=m/pow;
            int rem=m%pow;
            m=rem;
            System.out.println(ques);
            pow /= 10;
        }

    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=scan.nextInt();
        displayTheNumber(n);
        scan.close();
    }
}
