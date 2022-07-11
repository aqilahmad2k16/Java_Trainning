package Test24;

import java.util.Scanner;

public class Compression2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the string");

        String str = scan.nextLine();

        String s = str.charAt(0) + "";
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) != str.charAt(i-1)){
                s += str.charAt(i);
            }
        }

        System.out.println(s);
        scan.close();
    }
}
