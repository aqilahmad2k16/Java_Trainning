package Test24;

import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the string");

        String str = scan.nextLine();

        if(str.length() >= 8){
            for(int i=1; i<str.length(); i++){
                char ch = str.charAt(i);
                char ch1 = str.charAt(i-1);
                if(ch != ch1){

                    if((ch1 >= 'a' && ch1 <= 'z' )|| (ch1 >= 'A' && ch1 <= 'Z')|| (ch1 >= '0' && ch1 <= '9') || ch1 == '@' || ch1 == '#' || ch1 == '$' || ch1 == '%' || ch1 == '^' || ch1 == '&' || ch1 == '(' || ch1 == ')' || ch1 == '-' || ch1 == '+'){
                        
                    }
                }else{
                    System.out.println(false);
                    return;
                }
            }
        }else{
            System.out.println(false);
            return;
        }

        System.out.println(true);
    }
}
