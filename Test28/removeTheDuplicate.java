package Test28;

import java.util.Scanner;

public class removeTheDuplicate {
    public static void main(String[] args) {
        // s = "aabb"
        // s = "abcdeagb" we can use hashmap
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the string");

        String str  = scan.nextLine();

        String s = str.charAt(0)+"";
        int j=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != s.charAt(j)){
                s += str.charAt(i);
                j++;
            }
        }

        System.out.println(s);

        
    }
}
