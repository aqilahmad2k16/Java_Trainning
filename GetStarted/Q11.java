package GetStarted;

import java.util.Scanner;

public class Q11 {
    public static void exploreCuriousCaseOfBenjamin(int n){
        for(int i=1; i<=n; i++){
            if(i*i<=n){
                System.out.println("glowing bulbs are "+ i*i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int n=scan.nextInt();
        exploreCuriousCaseOfBenjamin(n);
        scan.close();
    }
}
