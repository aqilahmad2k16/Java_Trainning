package Pattern;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the patter");
        int n = scan.nextInt();

        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }

        scan.close();
    }
}
