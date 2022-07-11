package Test27;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the strings");
        String s = scan.nextLine();
        String t = scan.nextLine();
        if(t.length() > s.length()){
            System.out.println("not anagram " + false);
            return;
        }

        //approach 1st T.C = O(n) but S.C = O(n)
        // HashMap<Character, Integer> hm = new HashMap<>();

        // for(int i=0; i<s.length(); i++){
        //     if(!hm.containsKey(s.charAt(i))){
        //         hm.put(s.charAt(i), 1);
        //     }else{
        //         int val = hm.get(s.charAt(i));
        //         val++;
        //         hm.put(s.charAt(i), val);
        //     }
        // }

        // for(int i=0; i<t.length(); i++){
        //     if(!hm.containsKey(t.charAt(i))){
        //         System.out.println("not anaram "+ false);
        //         return;
        //     }else{
        //         int val=hm.get(t.charAt(i));
        //         val--;
        //         if(val==0){
        //             hm.remove(t.charAt(i));
        //         }else{
        //             hm.put(t.charAt(i), val);
        //         }
        //     }
        // }

        // System.out.println("anagram " + true);

        //2nd approach (use of count array)
        //T.C = O(n);
        // S.C = O(1);
        int[] count = new int[26];
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            count[ch - 'a']++;
        }

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            count[ch - 'a']--;
        }

        for(int i=0; i<count.length; i++){
            if(count[i] != 0){
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);


    }
}
