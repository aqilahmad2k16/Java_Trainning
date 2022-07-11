package GetStarted;

import java.util.Scanner;



public class Q2 {
    // public static void whetherGivenNumberPrime(int n) {
    //     int count=0;
    //     for(int div=2; div<n; div++){
    //         if(n%div==0){
    //             count++;
    //         }
    //     }

    //     if(count==0){
    //         System.out.println("number is prime");
    //     }else{
    //         System.out.println("number is not prime");
    //     }
    // }

    // efficeint way
    public static void whetherGivenNumberPrime(int n){
        int count=0;
        if(n>=2){

            for(int div=2; div*div<=n; div++){
                if(n%div==0){
                    count++;
                }
            }
    
            if(count==0){
                System.out.println("number is prime");
            }else{
                System.out.println("number is not prime");
            }
        }else{
            System.out.println("Number is not valid");
        }
    }
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
    
        int n=scan.nextInt();
        whetherGivenNumberPrime(n);
        scan.close();
    }
}
