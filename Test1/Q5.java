package Test1;

import java.util.Scanner;

public class Q5{
    public static void findSubString(String str){
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                System.out.println(str.substring(i, j));
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enther the string");
        String str = scan.nextLine();
        findSubString(str);
        scan.close();
    }

}