package GetStarted;

import java.util.Scanner;

public class Q8 {
    public static void rotateTheGivenNumber(int n, int k){
        int don=0;
        int m=n;
        while(n!=0){
            n /= 10;
            don++;
        }

        k=k%don;
        if(k<0){
            k=k+don;
        }

        int pow=(int)Math.pow(10, don-k);
        int pow1=(int)Math.pow(10, k);
        
        int rem=m%pow1;
        int ques=m/pow1;
        int sum=rem*pow+ques;
        System.out.println(sum);
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        int n=scan.nextInt();
        System.out.println("enter value of k");
        int k=scan.nextInt();
        rotateTheGivenNumber(n, k);
        scan.close();
    }
}
