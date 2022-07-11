package StringQueston;

import java.util.Scanner;

// import javax.print.attribute.IntegerSyntax;

public class S4 {
    public static void main(String[] args) {
        /// str = "123bcd3" then sum == 123+3 = 126
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the string");

        String str = scan.nextLine();
        int sum = 0;
        String temp = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9'){
                temp += ch;
            }else{
                if(temp.length() >0){

                    int val= Integer.parseInt(temp);
                    sum += val;
                    temp = "";
                }
            }
        }

        if(temp.length() > 0){

            int val = Integer.parseInt(temp);
            sum += val;
        }
        System.out.println(sum);
      

       
    }
}
