package Test28;

import java.util.HashMap;
import java.util.Scanner;

public class FindFrequency {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the string");

        String str  = scan.nextLine();

        HashMap<Character, Integer>  hm = new HashMap<>();
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(!hm.containsKey(ch)){
                hm.put(ch, 1);
            }else{
                int val = hm.get(ch);
                val++;
                hm.put(ch, val);
            }
        }

        for(Character key : hm.keySet()){
            if(hm.get(key) > 1){
                System.out.println(key+ " " + hm.get(key));
            }
        }
    }
}
