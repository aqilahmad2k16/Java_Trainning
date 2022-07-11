package GetStarted;

import java.util.Scanner;

public class Q12 {
    //find the PythaGorean triplet

    public static void findPythagoreanTriplet(int a, int b, int c){
        if(a>b && a>c){
            if(a*a == b*b + c*c){
                System.out.println("this is pythagorean triplet");
                
            }else{
                System.out.println("this is not pythagorean triplet");
                
            }
        }else if(b>c && b>c){
            if(b*b == a*a+c*c){
                System.out.println("this is pythagorean triplet");
                
            }else{
                System.out.println("this is not pythagorean triplet");
                
            }
        }else{
            if(c*c == a*a + b*b){
                System.out.println("this is pythagorean triplet");
                
            }else{
                System.out.println("this is not pythagorean triplet");
                
            }
        }
    }
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("enter three numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        findPythagoreanTriplet(a,b,c);
        scan.close();
    }
}
