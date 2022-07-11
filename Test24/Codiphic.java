package Test24;

import java.util.Scanner;

public class Codiphic{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter two string");
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        int i=1, j=1;
        int dif = s1.charAt(0)-s2.charAt(0);
        while(i<s1.length() && j<s2.length()){
            if(s1.charAt(i) - s2.charAt(j) != dif){
                System.out.println(false);
                return;
            }

            i++;
            j++;
        }

        System.out.println(true);

    }
}