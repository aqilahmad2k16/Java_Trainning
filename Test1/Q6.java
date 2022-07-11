package Test1;

import java.util.Scanner;

public class Q6 {
    public static void findNumberOfFactor(int n, int k){
        int c1 = 0;
        int c2 = 0;
        for(int i = 1; i<n; i++){
            for(int j=1; j<=i; j++){
                if(i%j == 0){
                    c1++;
                }
            }
            if(c1 == k){
                c2++;
                c1 = 0;
            }

            c1 = 0;
        }

        System.out.println(c2);
    }
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number and value of k");
        int n = scan.nextInt();
        int k = scan.nextInt();
        findNumberOfFactor(n, k);
        scan.close();
    }

}
