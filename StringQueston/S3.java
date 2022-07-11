package StringQueston;

import java.util.HashMap;
import java.util.Scanner;

public class S3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter two string");
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();

        HashMap<Character, Integer> hm = new HashMap<>();

        if(s1.length() != s2.length()){
            System.out.println(false);
            return;
        }

        for(int i=0; i<s1.length(); i++){
            if(!hm.containsKey(s1.charAt(i))){
                hm.put(s1.charAt(i), 1);
            }else{
                int val = hm.get(s1.charAt(i));
                val++;
                hm.put(s1.charAt(i), val);
            }
        }

        for(int i=0; i<s2.length(); i++){
            if(!hm.containsKey(s2.charAt(i))){
                System.out.println(false);
                return;
            }else{
                int val = hm.get(s2.charAt(i));
                val--;
                if(val == 0){
                    hm.remove(s2.charAt(i));
                }else{
                    hm.put(s2.charAt(i), val);
                }
            }
        }

        System.out.println(true);

        // T.C = O(n) here, n = length of string
        // S.C = O(n)

    }
}
