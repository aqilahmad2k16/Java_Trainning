package Test1;

import java.util.HashMap;
import java.util.Scanner;

public class Q3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enther the string");
        String str = scan.nextLine();
   
        HashMap<Character, Integer> hm = new HashMap<>();

        String s = "";
        for(int i=0; i<str.length(); i++){
            if(!hm.containsKey(str.charAt(i))){
                hm.put(str.charAt(i), 1);
            }else{
                int val = hm.get(str.charAt(i));
                val++;
                hm.put(str.charAt(i), val);
            }
        }

        for(Character ch : hm.keySet()){
            s += ch;
        }

        System.out.println(s);
        scan.close();
    }
}