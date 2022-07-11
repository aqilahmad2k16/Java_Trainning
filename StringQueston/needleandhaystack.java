package StringQueston;

import java.util.Scanner;

public class needleandhaystack{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter string");
        String hayStack = scan.nextLine();
        String needle = scan.nextLine();

        if(needle.length() == 0){
            System.out.println(0);
            return;
        }

        int n = hayStack.indexOf(needle);
        if(n != 0){
            System.out.println(n);
            return;
        }else{
            System.out.println(-1);
        }

      
    }
}