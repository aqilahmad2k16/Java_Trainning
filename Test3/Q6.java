package Test3;

import java.util.Scanner;

public class Q6 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // String str = "hey! there, what's up";
        System.out.println("enter the string");
        String str = scan.nextLine();
        String[] sArr = str.split(" ");
        String rStr = " ";

        //Q1 reverse the sentense 
        // for(int i=sArr.length-1; i>=0; i--){
        //     rStr += sArr[i] + " ";
        // }
        // System.out.println(rStr);


        // Q2 reverse the word in the same order
        for(int i=0; i<sArr.length; i++){
            StringBuilder sb = new StringBuilder(sArr[i]);
            sb.reverse(); // mutable function use to reverse the word T.C = O(n);
            rStr += sb.toString() + " "; // .toString() use to convert object to string T.C = O(n)
        }

        System.out.println(rStr.trim()); // use to remove the extra space from the stirng at the end of the string

    }
}
