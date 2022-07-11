package Recursion;

// import java.util.Scanner;

public class findPower{
    public static void main(String[] args) {
        double x = 2.1000;
        int n = 3;

        // Scanner scan = new Scanner(System.in);
        // double x = scan.nextDouble();
        // int n = scan.nextInt();

        // for extra decimal we use String result = String.format("%.2f", 2.45235);
            System.out.println(String.format("%.4f",findThePower(x, n)));
        
    }

    // public static double findThePower(double x, int n){
    //     if(n == 0){
    //         return 1;
    //     }

    //     double val = findThePower(x, n-1);
    //     return val*x;
    // }

    //efficient approach
    public static double findThePower(double x, int n){
        if(n == 0){
            return 1;
        }

        
        double val = findThePower(x, n/2);
        if(n%2 == 0){
            return val*val;
        }else{
            return x*val*val;
        }
            
        
    }
   
}