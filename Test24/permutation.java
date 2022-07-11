package Test24;

import java.util.Scanner;

public class permutation {
    public static int findFactorial(String str){
        int val=1;
        for(int i=1; i<=str.length(); i++){
            val = val*i;
        }
        return val;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the string");

        String str = scan.nextLine();

        int n = str.length();
        int f = findFactorial(str);
        for(int i=0; i<f; i++){
            StringBuilder sb = new StringBuilder(str);
            int temp =i;
            for(int j=n; j>=1; j--){
                int rem = temp%j;
                int ques = temp/j;
                System.out.print(sb.charAt(rem));
                sb.deleteCharAt(rem);
                temp = ques;
            }
            System.out.println();
        }
        scan.close();

    }
}
