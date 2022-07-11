package Test24;

import java.util.Scanner;



public class Compression1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the string");
    
        String str = scan.nextLine();
        String s = str.charAt(0) + "";
        int count =1;
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
            }else{
                if(count>1){
                    s+=count;
                    count=1;
                }
    
                s += str.charAt(i);
            }
        }
        if(count > 1)
        s += count;
        System.out.println(s);

        scan.close();
    }

}
