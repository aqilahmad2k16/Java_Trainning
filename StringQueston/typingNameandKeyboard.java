package StringQueston;

import java.util.Scanner;

public class typingNameandKeyboard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter string");
        String name = scan.nextLine();
        String typed = scan.nextLine();
        if(typed.length() < name.length()){
            System.out.println(false);
            return;
        }

        int i=0, j=0;
        char ch = ' ';
        while(i<name.length() || j<typed.length()){
            if(i<name.length() && j<typed.length() && name.charAt(i) == typed.charAt(j)){
                ch = name.charAt(i);
                i++;
                j++;
            }else if(j<typed.length() && ch == typed.charAt(j)){
                j++;
            }else{
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
        return;


    }
}
