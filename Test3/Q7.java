package Test3;

import java.util.Scanner;

class Q3{

    public static boolean findThePalindrome(String nStr){
        int l=0, r=nStr.length()-1;
        while(l<=r){
            if(nStr.charAt(l) != nStr.charAt(r)){
                return false;
            }else{
                l++;
                r--;
            }
        }

        return true;
    }
    public static void convertLowerToLowerCase(StringBuilder sb, String nStr){
        StringBuilder nsb = new StringBuilder();
        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i) >= 'A' || sb.charAt(i) <= 'Z'){

                char ch = (char)(sb.charAt(i) + 32);
                nsb.append(ch);
            }else if (sb.charAt(i) >= 'a' || sb.charAt(i) <= 'z'){
                nsb.append(sb.charAt(i));
            }
        }

        nStr += nsb.toString();
    
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the string");
        String str = scan.nextLine();

        String[] sArr = str.split(" ");
        String nStr = " ";
        for(int i=0; i<sArr.length; i++){
            convertLowerToLowerCase( new StringBuilder(sArr[i]), nStr);
        }
           
            
            

        System.out.println(findThePalindrome(nStr));

        // System.out.println(nStr);
    }
}